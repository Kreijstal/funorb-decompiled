/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends a {
    static int field_r;
    static le[] field_t;
    static int field_v;
    static int[] field_u;
    private hc[] field_s;
    private hc field_q;

    public ak() {
        this.field_s = new hc[6];
        this.field_q = new hc();
        hc dupTemp$0 = new hc();
        this.field_s[0] = dupTemp$0;
        hc var1 = dupTemp$0;
        var1.a(0);
    }

    ak(ak param0, boolean param1) {
        this();
        try {
            param0.a(124, (ak) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(le[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param1 != 4986) {
                this.field_q = (hc) null;
            }
            var4_int = param2;
            if (this.field_s[var4_int] == null) {
                this.field_s[var4_int] = new hc();
            }
            this.field_s[param2].field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ak.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(le[] param0, int param1) {
        hc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 250) {
              var7 = this.field_s;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = var7[var4];
                  if (var6 == 0) {
                    L2: {
                      if (var5 == null) {
                        break L2;
                      } else {
                        var5.field_e = param0;
                        break L2;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("ak.CA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, ak param1, boolean param2) {
        hc dupTemp$3 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        hc var5 = null;
        hc var6 = null;
        int var7 = 0;
        hc stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        hc stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        hc stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        hc stackIn_11_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        hc stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        hc stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        hc stackOut_10_2 = null;
        hc stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        hc stackOut_9_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  super.a(false, param1);
                  if (param2) {
                    break L3;
                  } else {
                    gl.a(this.field_s, 0, param1.field_s, 0, 6);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4_int = 0;
                L4: while (true) {
                  if (6 <= var4_int) {
                    break L2;
                  } else {
                    var5 = this.field_s[var4_int];
                    if (var7 != 0) {
                      break L1;
                    } else {
                      L5: {
                        L6: {
                          if (var5 == null) {
                            break L6;
                          } else {
                            L7: {
                              var6 = param1.field_s[var4_int];
                              stackOut_8_0 = (hc) (var5);
                              stackOut_8_1 = 124;
                              stackIn_10_0 = stackOut_8_0;
                              stackIn_10_1 = stackOut_8_1;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              if (var6 == null) {
                                dupTemp$3 = new hc();
                                param1.field_s[var4_int] = dupTemp$3;
                                stackOut_10_0 = (hc) ((Object) stackIn_10_0);
                                stackOut_10_1 = stackIn_10_1;
                                stackOut_10_2 = (hc) (dupTemp$3);
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                stackIn_11_2 = stackOut_10_2;
                                break L7;
                              } else {
                                stackOut_9_0 = (hc) ((Object) stackIn_9_0);
                                stackOut_9_1 = stackIn_9_1;
                                stackOut_9_2 = (hc) (var6);
                                stackIn_11_0 = stackOut_9_0;
                                stackIn_11_1 = stackOut_9_1;
                                stackIn_11_2 = stackOut_9_2;
                                break L7;
                              }
                            }
                            ((hc) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        param1.field_s[var4_int] = null;
                        break L5;
                      }
                      var4_int++;
                      if (var7 == 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (param0 >= 100) {
                break L1;
              } else {
                ak.a((byte) -47);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ak.BA(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 <= (param1 ^ -1)) {
                  break L2;
                } else {
                  if (128 > param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (255 >= param1) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (param1 == 0) {
                    break L5;
                  } else {
                    var6 = sb.field_n;
                    var2 = var6;
                    var3 = 0;
                    L6: while (true) {
                      if (var6.length <= var3) {
                        break L5;
                      } else {
                        var4 = var6[var3];
                        stackOut_12_0 = var4 ^ -1;
                        stackIn_18_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var5 != 0) {
                          break L4;
                        } else {
                          if (stackIn_13_0 != (param1 ^ -1)) {
                            var3++;
                            if (var5 == 0) {
                              continue L6;
                            } else {
                              break L5;
                            }
                          } else {
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L4;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "ak.DA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
            ak.a((byte) -46);
            field_u = null;
            field_t = null;
            return;
        }
        field_u = null;
        field_t = null;
    }

    final void a(byte param0, le param1) {
        hc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            if (param0 == 1) {
              L1: while (true) {
                if (var4 >= var7.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = var7[var4];
                  if (var6 == 0) {
                    L2: {
                      if (var5 != null) {
                        var5.field_a = param1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("ak.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (uj.field_i != -ea.field_b + 0) {
          if (uj.field_i == -ea.field_b + 250) {
            if (param0 != 99) {
              return;
            } else {
              uj.field_i = uj.field_i + 1;
              return;
            }
          } else {
            if (param0 != 99) {
              return;
            } else {
              uj.field_i = uj.field_i + 1;
              return;
            }
          }
        } else {
          if (param0 != 99) {
            return;
          } else {
            uj.field_i = uj.field_i + 1;
            return;
          }
        }
    }

    final hc a(byte param0, int param1) {
        hc dupTemp$4 = null;
        hc dupTemp$5 = null;
        if (param0 != -102) {
          field_t = (le[]) null;
          dupTemp$4 = new hc();
          this.field_s[param1] = dupTemp$4;
          return dupTemp$4;
        } else {
          dupTemp$5 = new hc();
          this.field_s[param1] = dupTemp$5;
          return dupTemp$5;
        }
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        hc var7 = null;
        hc var9 = null;
        ak var10 = null;
        t var11 = null;
        hc var12 = null;
        hc var13 = null;
        hc var14 = null;
        hc var15 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof t) {
                stackOut_2_0 = (we) (param1);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (we) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (t) ((Object) stackIn_3_0);
              qi.a(param1.field_r + param3 + param1.field_l, true, param1.field_p + param1.field_e + param2, param1.field_r + param3, param2 + param1.field_e);
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_w;
                break L2;
              }
            }
            L3: {
              if (param4 >= 19) {
                break L3;
              } else {
                var10 = (ak) null;
                this.a(123, (ak) null, false);
                break L3;
              }
            }
            L4: {
              var7 = this.field_s[0];
              this.field_q.a(0);
              var7.a(param3, (ak) (this), param2, 84, param1, this.field_q);
              if (var11 == null) {
                break L4;
              } else {
                L5: {
                  if (var11.field_u) {
                    var12 = this.field_s[1];
                    if (var12 == null) {
                      break L5;
                    } else {
                      var12.a(param3, (ak) (this), param2, 112, param1, this.field_q);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (var11.field_g) {
                  L6: {
                    L7: {
                      var13 = this.field_s[3];
                      if (var11.field_t == 0) {
                        break L7;
                      } else {
                        if (var13 != null) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var9 = this.field_s[2];
                      if (var9 != null) {
                        var9.a(param3, (ak) (this), param2, 115, param1, this.field_q);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!MonkeyPuzzle2.field_F) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  var13.a(param3, (ak) (this), param2, 100, param1, this.field_q);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L9: {
              if (!param1.b((byte) 56)) {
                break L9;
              } else {
                var14 = this.field_s[5];
                if (var14 != null) {
                  var14.a(param3, (ak) (this), param2, 114, param1, this.field_q);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (param0) {
                break L10;
              } else {
                var15 = this.field_s[4];
                if (var15 != null) {
                  var15.a(param3, (ak) (this), param2, 120, param1, this.field_q);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            this.field_q.a((ak) (this), param1, (byte) -2, param2, param3);
            tj.b(653);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var6);
            stackOut_32_1 = new StringBuilder().append("ak.C(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_r = 0;
        field_v = 2;
    }
}
