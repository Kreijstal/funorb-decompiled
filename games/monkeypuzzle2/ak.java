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
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_e = param0;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
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
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ak.CA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, ak param1, boolean param2) {
        hc dupTemp$2 = null;
        int var4_int = 0;
        hc var5 = null;
        hc var6 = null;
        int var7 = 0;
        hc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        hc stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        hc stackIn_9_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(false, param1);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_s[var4_int];
                      if (var5 == null) {
                        param1.field_s[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param1.field_s[var4_int];
                          stackIn_8_0 = (hc) (var5);

                          stackIn_8_1 = 124;

                          if (var6 == null) {
                            dupTemp$2 = new hc();
                            param1.field_s[var4_int] = dupTemp$2;
                            stackIn_9_0 = (hc) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (hc) (dupTemp$2);
                            break L4;
                          } else {
                            stackIn_9_0 = (hc) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (hc) (var6);
                            break L4;
                          }
                        }
                        ((hc) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                gl.a(this.field_s, 0, param1.field_s, 0, 6);
                break L1;
              }
            }
            L5: {
              if (param0 >= 100) {
                break L5;
              } else {
                ak.a((byte) -47);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ak.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
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
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                if (param1 == 0) {
                  break L4;
                } else {
                  var6 = sb.field_n;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var6.length <= var3) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L5;
                      } else {
                        stackIn_14_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackIn_17_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
            stackIn_8_0 = 1;
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
            return stackIn_14_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
            ak.a((byte) -46);
        }
        field_u = null;
        field_t = null;
    }

    final void a(byte param0, le param1) {
        hc[] var3 = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_a = param1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
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
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ak.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (uj.field_i != -ea.field_b + 0 && uj.field_i == -ea.field_b + 250) {
        }
        if (param0 != 99) {
            return;
        }
        uj.field_i = uj.field_i + 1;
    }

    final hc a(byte param0, int param1) {
        if (param0 != -102) {
            field_t = (le[]) null;
        }
        hc dupTemp$0 = new hc();
        this.field_s[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        we stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        hc var7 = null;
        hc var9 = null;
        ak var10 = null;
        t var11 = null;
        hc var12 = null;
        hc var13 = null;
        hc var14 = null;
        hc var15 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof t) {
                stackIn_3_0 = (we) (param1);
                break L1;
              } else {
                stackIn_3_0 = null;
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
                    var13 = this.field_s[3];
                    if (var11.field_t == 0) {
                      break L6;
                    } else {
                      if (var13 != null) {
                        var13.a(param3, (ak) (this), param2, 100, param1, this.field_q);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = this.field_s[2];
                  if (var9 != null) {
                    var9.a(param3, (ak) (this), param2, 115, param1, this.field_q);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              if (!param1.b((byte) 56)) {
                break L7;
              } else {
                var14 = this.field_s[5];
                if (var14 != null) {
                  var14.a(param3, (ak) (this), param2, 114, param1, this.field_q);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (param0) {
                break L8;
              } else {
                var15 = this.field_s[4];
                if (var15 != null) {
                  var15.a(param3, (ak) (this), param2, 120, param1, this.field_q);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_q.a((ak) (this), param1, (byte) -2, param2, param3);
            tj.b(653);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("ak.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_r = 0;
        field_v = 2;
    }
}
