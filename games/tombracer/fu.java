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
        if (param0) {
            this.field_r = (fla) null;
        }
        this.field_u = param1;
    }

    fu(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_v = null;
        this.field_n = true;
        this.field_r = null;
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 90, param1);
            int var3_int = 39 % ((-8 - param0) / 40);
            param1.a((byte) -128, this.field_u, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              L2: {
                if (this.field_u == 0) {
                  break L2;
                } else {
                  if (this.field_u == 1) {
                    gqa.a(this.field_m, -83584144, param1, param2, df.field_J[76], param3);
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              via.a(df.field_J[17], this.field_m, this.field_q, param3 + 1572864, param2, param1, 111, 0);
              break L1;
            }
            var6_int = 67 % ((param4 - -38) / 47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("fu.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        String var6 = null;
        CharSequence var7 = null;
        L0: {
          if (null == bl.field_a) {
            break L0;
          } else {
            var3 = bl.field_a.a(param2, 1513);
            if (-1 != (var3 ^ -1)) {
              L1: {
                if ((var3 ^ -1) != -3) {
                  break L1;
                } else {
                  if (bl.field_a.field_r == null) {
                    break L1;
                  } else {
                    if (bl.field_a.field_r.equals("")) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          if (bl.field_a.field_r.charAt(0) != 91) {
                            break L3;
                          } else {
                            var4 = bl.field_a.field_r;
                            if (!TombRacer.field_G) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var7 = (CharSequence) ((Object) bl.field_a.field_r);
                        var4 = jd.a(1, var7);
                        break L2;
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
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              bl.field_a = null;
              cn.field_k = -1;
              break L0;
            } else {
              break L0;
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
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        iq var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("fu.G(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void n(byte param0) {
        field_t = null;
        if (param0 != -51) {
            field_t = (jea) null;
        }
    }

    final void d(int param0) {
        fla discarded$1 = null;
        int var2 = 0;
        int var3_int = 0;
        fsa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7_int = 0;
        wda var7 = null;
        nv var8 = null;
        int var9 = 0;
        w var10 = null;
        vna var11 = null;
        uja var12 = null;
        vna var13 = null;
        uja var14 = null;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          L1: {
            var9 = TombRacer.field_G ? 1 : 0;
            super.d(param0);
            if (this.field_u == 0) {
              break L1;
            } else {
              if (-2 != (this.field_u ^ -1)) {
                break L0;
              } else {
                L2: {
                  if (null == this.field_k) {
                    break L2;
                  } else {
                    if (this.field_k.a(-93)) {
                      break L2;
                    } else {
                      break L0;
                    }
                  }
                }
                this.field_m = dfa.a(128 + this.field_m, 2048, 122);
                if (var9 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L3: {
            L4: {
              var4 = this.j((byte) 16).d(3);
              var5 = this.j((byte) 16).e(param0 + 9649);
              if (this.field_n) {
                break L4;
              } else {
                var3_int = var5 + -this.field_p;
                var2 = var4 + -this.field_o;
                if (var9 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            var3_int = 0;
            var2 = 0;
            this.field_n = false;
            break L3;
          }
          L5: {
            this.field_p = var5;
            this.field_o = var4;
            if (var2 != 0) {
              break L5;
            } else {
              if (-1 == (var3_int ^ -1)) {
                break L0;
              } else {
                break L5;
              }
            }
          }
          L6: {
            this.field_m = dfa.a(qva.a((byte) -103, -var3_int, var2) >> -1645706462, 2048, 125);
            this.field_q = dfa.a(this.field_q - (ua.a(var2 >> 707053709, -113) - -ua.a(var3_int >> 816062445, 67)), 2048, -100);
            if (65536 < ua.a(var2, param0 + 93)) {
              break L6;
            } else {
              if (ua.a(var3_int, param0 ^ -85) <= 65536) {
                break L0;
              } else {
                break L6;
              }
            }
          }
          this.a(103).a(false, this.b((byte) -119), 0, -var2, this.c((byte) 127), -var3_int);
          break L0;
        }
        var10 = (w) ((Object) this.a(param0 + 64).field_G);
        if (var10 == null) {
          return;
        } else {
          L7: {
            var3 = (fsa) ((Object) this.field_h);
            if (!var3.d(50, false)) {
              if (this.field_u == 1) {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L7;
              } else {
                stackOut_22_0 = 0;
                stackIn_25_0 = stackOut_22_0;
                break L7;
              }
            } else {
              stackOut_20_0 = 1;
              stackIn_25_0 = stackOut_20_0;
              break L7;
            }
          }
          L8: {
            L9: {
              L10: {
                var4 = stackIn_25_0;
                if (var4 == 0) {
                  break L10;
                } else {
                  if (null == this.field_v) {
                    break L9;
                  } else {
                    if (!this.field_v.l((byte) -101)) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              if (this.field_v == null) {
                break L8;
              } else {
                if (var4 != 0) {
                  break L8;
                } else {
                  this.field_v.a(-90, var10);
                  this.field_v = null;
                  if (var9 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L11: {
              if (this.field_u == 0) {
                break L11;
              } else {
                if (-2 == (this.field_u ^ -1)) {
                  this.field_v = var10.a(new fm(11, this.b((byte) 112), this.c((byte) 121), this.e((byte) -125)), -58);
                  if (var9 == 0) {
                    break L8;
                  } else {
                    break L11;
                  }
                } else {
                  break L8;
                }
              }
            }
            this.field_v = var10.a(new fm(10, this.b((byte) -90), this.c((byte) 103), this.e((byte) -103)), param0 + -57);
            break L8;
          }
          L12: {
            if (this.field_v == null) {
              break L12;
            } else {
              this.field_v.a(this.b((byte) -83), var10.field_c, -128, var10.field_h, this.c((byte) 107));
              break L12;
            }
          }
          L13: {
            if (-2 != (this.field_u ^ -1)) {
              break L13;
            } else {
              L14: {
                var11 = var3.field_u;
                var12 = new uja(var11);
                var7_int = 0;
                var8 = (nv) ((Object) var12.a(true));
                if (var8 == null) {
                  if (var7_int == 0) {
                    break L14;
                  } else {
                    if (null != this.field_r) {
                      break L14;
                    } else {
                      this.field_r = var10.a(new fm(12, this.b((byte) -105), this.c((byte) 104), this.e((byte) -119)), -58);
                      break L14;
                    }
                  }
                } else {
                  if (var7_int == 0) {
                    break L14;
                  } else {
                    if (null != this.field_r) {
                      break L14;
                    } else {
                      this.field_r = var10.a(new fm(12, this.b((byte) -105), this.c((byte) 104), this.e((byte) -119)), -58);
                      break L14;
                    }
                  }
                }
              }
              if (this.field_r == null) {
                break L13;
              } else {
                if (!this.field_r.field_i.field_f.e()) {
                  break L13;
                } else {
                  this.field_r.a(-88, var10);
                  this.field_r = null;
                  break L13;
                }
              }
            }
          }
          L15: {
            if (0 == this.field_u) {
              var13 = var3.field_B;
              var14 = new uja(var13);
              var7 = (wda) ((Object) var14.a(true));
              L16: while (true) {
                if (var7 == null) {
                  break L15;
                } else {
                  if (var9 != 0) {
                    break L15;
                  } else {
                    L17: {
                      if (!(var7 instanceof ro)) {
                        break L17;
                      } else {
                        if (((ro) ((Object) var7)).d(false) != this.field_s) {
                          discarded$1 = var10.a(new fm(3, this.b((byte) 68), this.c((byte) 124), this.e((byte) -111)), -58);
                          this.field_s = ((ro) ((Object) var7)).d(false);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var7 = (wda) ((Object) var14.a(param0 + 0));
                    if (var9 == 0) {
                      continue L16;
                    } else {
                      break L15;
                    }
                  }
                }
              }
            } else {
              break L15;
            }
          }
          return;
        }
    }

    static {
    }
}
