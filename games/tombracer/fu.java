/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu extends dg {
    private fla field_r;
    private fla field_v;
    private int field_s;
    private int field_p;
    private int field_o;
    private int field_m;
    private boolean field_n;
    private int field_u;
    private int field_q;
    static jea field_t;

    final void a(boolean param0, int param1) {
        try {
            if (param0) {
                this.field_r = (fla) null;
            }
            this.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fu.H(" + param0 + ',' + param1 + ')');
        }
    }

    fu(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_v = null;
        this.field_n = true;
        this.field_r = null;
    }

    final void a(byte param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a((byte) 90, param1);
            var3_int = 39 % ((-8 - param0) / 40);
            param1.a((byte) -128, this.field_u, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fu.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    fu(int param0) {
        super(param0);
        this.field_v = null;
        this.field_n = true;
        this.field_r = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_u == 0) {
                via.a(df.field_J[17], this.field_m, this.field_q, param3 + 1572864, param2, param1, 111, 0);
                break L1;
              } else {
                if (this.field_u == 1) {
                  gqa.a(this.field_m, -83584144, param1, param2, df.field_J[76], param3);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6_int = 67 % ((param4 - -38) / 47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("fu.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        Object var5 = null;
        String var6 = null;
        CharSequence var7 = null;
        try {
          L0: {
            L1: {
              if (null == bl.field_a) {
                break L1;
              } else {
                var3_int = bl.field_a.a(param2, 1513);
                if (-1 != (var3_int ^ -1)) {
                  L2: {
                    if ((var3_int ^ -1) != -3) {
                      break L2;
                    } else {
                      if (bl.field_a.field_r == null) {
                        break L2;
                      } else {
                        if (bl.field_a.field_r.equals("")) {
                          break L2;
                        } else {
                          L3: {
                            if (bl.field_a.field_r.charAt(0) != 91) {
                              var7 = (CharSequence) ((Object) bl.field_a.field_r);
                              var4 = jd.a(1, var7);
                              break L3;
                            } else {
                              var4 = bl.field_a.field_r;
                              break L3;
                            }
                          }
                          L4: {
                            var5 = null;
                            if (-1 == (cn.field_k ^ -1)) {
                              var5 = rf.a(true, var4, param1);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if (1 != cn.field_k) {
                              break L5;
                            } else {
                              var5 = uca.a(var4, (byte) 102, param1);
                              break L5;
                            }
                          }
                          L6: {
                            if (-3 == (cn.field_k ^ -1)) {
                              var5 = nna.a(-3, var4, param1);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (3 == cn.field_k) {
                              var5 = kc.a(var4, param1, false, var4);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (var5 != null) {
                            var6 = (String) null;
                            gu.a(0, true, var4, (String) (var5), (String) null, 2);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  bl.field_a = null;
                  cn.field_k = -1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L8: {
              if (param0 <= -37) {
                break L8;
              } else {
                fu.n((byte) 14);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "fu.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        iq var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              super.a(120, param1, param2);
              if (param0 > 119) {
                break L1;
              } else {
                var5 = (iq) null;
                this.a((iq) null, -12, 26, 100, (byte) -44);
                break L1;
              }
            }
            L2: {
              if ((param1.field_E ^ -1) > -17) {
                break L2;
              } else {
                this.field_u = param2.b((byte) 44, 4);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("fu.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);

            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public static void n(byte param0) {
        try {
            field_t = null;
            if (param0 != -51) {
                field_t = (jea) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fu.F(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        int var3_int = 0;
        fsa var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var7_int = 0;
        wda var7 = null;
        nv var8 = null;
        int var9 = 0;
        Object var10 = null;
        w var10_ref = null;
        vna var11 = null;
        uja var12 = null;
        vna var13 = null;
        uja var14 = null;
        var10 = null;
        var3 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.d(param0);
              if (this.field_u == 0) {
                L2: {
                  var4 = this.j((byte) 16).d(3);
                  var5 = this.j((byte) 16).e(param0 + 9649);
                  if (this.field_n) {
                    var3_int = 0;
                    var2_int = 0;
                    this.field_n = false;
                    break L2;
                  } else {
                    var3_int = var5 + -this.field_p;
                    var2_int = var4 + -this.field_o;
                    break L2;
                  }
                }
                L3: {
                  this.field_p = var5;
                  this.field_o = var4;
                  if (var2_int != 0) {
                    break L3;
                  } else {
                    if (-1 == (var3_int ^ -1)) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  this.field_m = dfa.a(qva.a((byte) -103, -var3_int, var2_int) >> -1645706462, 2048, 125);
                  this.field_q = dfa.a(this.field_q - (ua.a(var2_int >> 707053709, -113) - -ua.a(var3_int >> 816062445, 67)), 2048, -100);
                  if (65536 < ua.a(var2_int, param0 + 93)) {
                    break L4;
                  } else {
                    if (ua.a(var3_int, param0 ^ -85) <= 65536) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                this.a(103).a(false, this.b((byte) -119), 0, -var2_int, this.c((byte) 127), -var3_int);
                break L1;
              } else {
                if (-2 != (this.field_u ^ -1)) {
                  break L1;
                } else {
                  L5: {
                    if (null == this.field_k) {
                      break L5;
                    } else {
                      if (this.field_k.a(-93)) {
                        break L5;
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.field_m = dfa.a(128 + this.field_m, 2048, 122);
                  break L1;
                }
              }
            }
            var10_ref = (w) ((Object) this.a(param0 + 64).field_G);
            if (var10_ref == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L6: {
                var3_ref = (fsa) ((Object) this.field_h);
                if (!var3_ref.d(50, false)) {
                  if (this.field_u == 1) {
                    stackIn_28_0 = 1;
                    break L6;
                  } else {
                    stackIn_28_0 = 0;
                    break L6;
                  }
                } else {
                  stackIn_28_0 = 1;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var4 = stackIn_28_0;
                  if (var4 == 0) {
                    break L8;
                  } else {
                    L9: {
                      if (null == this.field_v) {
                        break L9;
                      } else {
                        if (!this.field_v.l((byte) -101)) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (this.field_u == 0) {
                      this.field_v = var10_ref.a(new fm(10, this.b((byte) -90), this.c((byte) 103), this.e((byte) -103)), param0 + -57);
                      break L7;
                    } else {
                      if (-2 == (this.field_u ^ -1)) {
                        this.field_v = var10_ref.a(new fm(11, this.b((byte) 112), this.c((byte) 121), this.e((byte) -125)), -58);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                if (this.field_v == null) {
                  break L7;
                } else {
                  if (var4 != 0) {
                    break L7;
                  } else {
                    this.field_v.a(-90, var10_ref);
                    this.field_v = null;
                    break L7;
                  }
                }
              }
              L10: {
                if (this.field_v == null) {
                  break L10;
                } else {
                  this.field_v.a(this.b((byte) -83), var10_ref.field_c, -128, var10_ref.field_h, this.c((byte) 107));
                  break L10;
                }
              }
              L11: {
                if (-2 != (this.field_u ^ -1)) {
                  break L11;
                } else {
                  var11 = var3_ref.field_u;
                  var12 = new uja(var11);
                  var7_int = 0;
                  var8 = (nv) ((Object) var12.a(true));
                  L12: while (true) {
                    if (var8 == null) {
                      L13: {
                        if (var7_int == 0) {
                          break L13;
                        } else {
                          if (null != this.field_r) {
                            break L13;
                          } else {
                            this.field_r = var10_ref.a(new fm(12, this.b((byte) -105), this.c((byte) 104), this.e((byte) -119)), -58);
                            break L13;
                          }
                        }
                      }
                      if (this.field_r == null) {
                        break L11;
                      } else {
                        if (!this.field_r.field_i.field_f.e()) {
                          break L11;
                        } else {
                          this.field_r.a(-88, var10_ref);
                          this.field_r = null;
                          break L11;
                        }
                      }
                    } else {
                      L14: {
                        if (!(var8 instanceof fra)) {
                          break L14;
                        } else {
                          if (-1 > (((fra) ((Object) var8)).field_o ^ -1)) {
                            var7_int = 1;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var8 = (nv) ((Object) var12.a(-1));
                      continue L12;
                    }
                  }
                }
              }
              L15: {
                if (0 == this.field_u) {
                  var13 = var3_ref.field_B;
                  var14 = new uja(var13);
                  var7 = (wda) ((Object) var14.a(true));
                  L16: while (true) {
                    if (var7 == null) {
                      break L15;
                    } else {
                      L17: {
                        if (!(var7 instanceof ro)) {
                          break L17;
                        } else {
                          if (((ro) ((Object) var7)).d(false) != this.field_s) {
                            var10_ref.a(new fm(3, this.b((byte) 68), this.c((byte) 124), this.e((byte) -111)), -58);
                            this.field_s = ((ro) ((Object) var7)).d(false);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var7 = (wda) ((Object) var14.a(param0 + 0));
                      continue L16;
                    }
                  }
                } else {
                  break L15;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fu.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
