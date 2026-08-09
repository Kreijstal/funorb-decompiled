/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pc extends nf {
    static int field_R;
    private int field_Q;
    private int field_W;
    private sd field_O;
    private int field_S;
    private ue field_Y;
    private int field_V;
    private we field_T;
    static le[] field_U;
    private int field_X;
    static String field_P;

    private final void a(we param0, int param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_Y != null) {
                this.field_Y.c(param1 ^ -19820);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == null) {
                  break L3;
                } else {
                  param0.a(param0.field_p, 13361, 6, param0.field_l, this.field_V + 6);
                  this.field_Y = new ue(param0);
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_Y = new ue();
              break L2;
            }
            L4: {
              this.b((byte) -114, this.field_Y);
              this.field_T = null;
              if (param1 == 6) {
                break L4;
              } else {
                this.p(-125);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("pc.M(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        if (param0 == 10) {
          if (fl.field_c == this.field_O) {
            return;
          } else {
            this.field_O = ie.field_c;
            this.field_X = 0;
            this.a(this.field_T, 6);
            this.field_T = null;
            this.field_Y.field_F = 0;
            return;
          }
        } else {
          this.c((byte) 67, (we) null);
          if (fl.field_c == this.field_O) {
            return;
          } else {
            this.field_O = ie.field_c;
            this.field_X = 0;
            this.a(this.field_T, 6);
            this.field_T = null;
            this.field_Y.field_F = 0;
            return;
          }
        }
    }

    void c(byte param0, we param1) {
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
              if (param0 >= 25) {
                break L1;
              } else {
                this.e((byte) 67);
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_T = param1;
                if (q.field_c == this.field_O) {
                  break L3;
                } else {
                  if (this.field_O != fl.field_c) {
                    this.field_X = 0;
                    this.field_O = fl.field_c;
                    if (!MonkeyPuzzle2.field_F) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              this.b(this.field_V + (12 + this.field_T.field_p), 0, this.field_T.field_l + 12, this.field_Q);
              this.field_X = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("pc.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    boolean k(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != this.field_O) {
          if (fl.field_c == this.field_O) {
            fieldTemp$4 = this.field_X + 1;
            this.field_X = this.field_X + 1;
            if (fieldTemp$4 != this.field_S) {
              this.field_Y.field_F = -((this.field_X << -1959187128) / this.field_S) + 256;
              if (param0 == -23913) {
                return super.k(-23913);
              } else {
                this.b(false);
                return super.k(-23913);
              }
            } else {
              this.field_O = q.field_c;
              this.b(this.field_T.field_p + (12 - -this.field_V), 0, this.field_T.field_l + 12, this.field_Q);
              this.field_X = 0;
              this.field_Y.field_F = 0;
              if (var3 == 0) {
                if (param0 == -23913) {
                  return super.k(-23913);
                } else {
                  this.b(false);
                  return super.k(-23913);
                }
              } else {
                this.field_Y.field_F = -((this.field_X << -1959187128) / this.field_S) + 256;
                if (param0 == -23913) {
                  return super.k(-23913);
                } else {
                  this.b(false);
                  return super.k(-23913);
                }
              }
            }
          } else {
            if (this.field_O == ie.field_c) {
              fieldTemp$5 = this.field_X + 1;
              this.field_X = this.field_X + 1;
              if (fieldTemp$5 != this.field_W) {
                this.field_Y.field_F = (this.field_X << 1103775592) / this.field_W;
                if (var3 != 0) {
                  fieldTemp$6 = this.field_X + 1;
                  this.field_X = this.field_X + 1;
                  if (fieldTemp$6 != this.field_S) {
                    this.field_Y.field_F = -((this.field_X << -1959187128) / this.field_S) + 256;
                    if (param0 != -23913) {
                      this.b(false);
                      return super.k(-23913);
                    } else {
                      return super.k(-23913);
                    }
                  } else {
                    this.field_O = q.field_c;
                    this.b(this.field_T.field_p + (12 - -this.field_V), 0, this.field_T.field_l + 12, this.field_Q);
                    this.field_X = 0;
                    this.field_Y.field_F = 0;
                    if (var3 == 0) {
                      if (param0 != -23913) {
                        this.b(false);
                        return super.k(-23913);
                      } else {
                        return super.k(-23913);
                      }
                    } else {
                      this.field_Y.field_F = -((this.field_X << -1959187128) / this.field_S) + 256;
                      if (param0 != -23913) {
                        this.b(false);
                        return super.k(-23913);
                      } else {
                        return super.k(-23913);
                      }
                    }
                  }
                } else {
                  if (param0 != -23913) {
                    this.b(false);
                    return super.k(-23913);
                  } else {
                    return super.k(-23913);
                  }
                }
              } else {
                this.field_Y.field_F = 256;
                this.field_O = null;
                if (var3 != 0) {
                  L0: {
                    this.field_Y.field_F = (this.field_X << 1103775592) / this.field_W;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      L1: {
                        fieldTemp$7 = this.field_X + 1;
                        this.field_X = this.field_X + 1;
                        if (fieldTemp$7 != this.field_S) {
                          break L1;
                        } else {
                          this.field_O = q.field_c;
                          this.b(this.field_T.field_p + (12 - -this.field_V), 0, this.field_T.field_l + 12, this.field_Q);
                          this.field_X = 0;
                          this.field_Y.field_F = 0;
                          break L1;
                        }
                      }
                      this.field_Y.field_F = -((this.field_X << -1959187128) / this.field_S) + 256;
                      break L0;
                    }
                  }
                  if (param0 != -23913) {
                    this.b(false);
                    return super.k(-23913);
                  } else {
                    return super.k(-23913);
                  }
                } else {
                  if (param0 != -23913) {
                    this.b(false);
                    return super.k(-23913);
                  } else {
                    return super.k(-23913);
                  }
                }
              }
            } else {
              if (param0 != -23913) {
                this.b(false);
                return super.k(-23913);
              } else {
                return super.k(-23913);
              }
            }
          }
        } else {
          if (param0 == -23913) {
            return super.k(-23913);
          } else {
            this.b(false);
            return super.k(-23913);
          }
        }
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        boolean stackIn_24_0 = false;
        String stackIn_31_0 = null;
        int stackIn_34_0 = 0;
        String stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = pl.a((byte) 109, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (ok.a(-61, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (!ok.a(-57, var4.charAt(-1 + var4.length()))) {
                                L4: {
                                  if (param0 <= -92) {
                                    break L4;
                                  } else {
                                    pc.a((byte) 28, false, (CharSequence) null);
                                    break L4;
                                  }
                                }
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    L7: {
                                      if (var6 >= param2.length()) {
                                        break L7;
                                      } else {
                                        var7 = param2.charAt(var6);
                                        stackOut_23_0 = ok.a(-115, (char) var7);
                                        stackIn_34_0 = stackOut_23_0 ? 1 : 0;
                                        stackIn_24_0 = stackOut_23_0;
                                        if (var8 != 0) {
                                          break L6;
                                        } else {
                                          L8: {
                                            L9: {
                                              if (!stackIn_24_0) {
                                                break L9;
                                              } else {
                                                var5++;
                                                if (var8 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            break L8;
                                          }
                                          L10: {
                                            if ((var5 ^ -1) > -3) {
                                              break L10;
                                            } else {
                                              if (param1) {
                                                break L10;
                                              } else {
                                                stackIn_31_0 = ac.field_d;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L5;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    stackIn_34_0 = -1;
                                    break L6;
                                  }
                                  if (stackIn_34_0 > (var5 ^ -1)) {
                                    stackIn_37_0 = n.field_c;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackIn_18_0 = n.field_c;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = cm.field_B;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = cm.field_B;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = cm.field_B;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("pc.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L11;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  return stackIn_37_0;
                }
              }
            }
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          this.field_T = (we) null;
          this.p(-21);
          return super.b(false);
        } else {
          this.p(-21);
          return super.b(false);
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 72 / ((param3 - 37) / 50);
            if (!super.a(param0, param1, param2, -113)) {
              if (this.field_Y != null) {
                L1: {
                  if (-99 == (param2 ^ -1)) {
                    this.field_Y.a(param0, false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 != 99) {
                    break L2;
                  } else {
                    this.field_Y.a(param0, false);
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("pc.V(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final void p(int param0) {
        if (null == this.field_O) {
          super.p(param0 ^ 0);
          if (param0 != -21) {
            this.c((byte) -90, (we) null);
            return;
          } else {
            return;
          }
        } else {
          if (ie.field_c == this.field_O) {
            this.field_Y.field_F = 256;
            this.field_O = null;
            super.p(param0 ^ 0);
            if (param0 == -21) {
              return;
            } else {
              this.c((byte) -90, (we) null);
              return;
            }
          } else {
            this.a(12 - -this.field_V + this.field_T.field_p, (byte) -11, this.field_T.field_l + 12);
            this.a(this.field_T, 6);
            this.field_Y.field_F = 256;
            this.field_O = null;
            super.p(param0 ^ 0);
            if (param0 == -21) {
              return;
            } else {
              this.c((byte) -90, (we) null);
              return;
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_U = null;
        field_P = null;
        if (!param0) {
            field_R = 105;
        }
    }

    pc(kj param0, we param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_p + (param2 + 12));
        try {
            this.field_W = param3;
            this.field_S = param3;
            this.field_V = param2;
            this.field_Q = param4;
            this.a(param1, 6);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              ah.field_h = false;
              if (param0 == -46) {
                break L1;
              } else {
                field_R = 44;
                break L1;
              }
            }
            L2: {
              hj.field_L = false;
              if (null == me.field_f) {
                break L2;
              } else {
                if (me.field_f.field_z) {
                  L3: {
                    if (param1 != 8) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          param1 = 2;
                          if (fk.field_a) {
                            break L5;
                          } else {
                            param2 = od.field_o;
                            if (!MonkeyPuzzle2.field_F) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        param2 = r.field_b;
                        break L4;
                      }
                      j.field_e.a(bh.field_b, (byte) -34);
                      break L3;
                    }
                  }
                  L6: {
                    var3_int = 1;
                    if ((param1 ^ -1) != -11) {
                      break L6;
                    } else {
                      wj.d((byte) 35);
                      var3_int = 0;
                      break L6;
                    }
                  }
                  L7: {
                    if (var3_int != 0) {
                      L8: {
                        if (!hj.field_L) {
                          break L8;
                        } else {
                          param2 = gg.a(new String[]{param2}, ek.field_c, true);
                          break L8;
                        }
                      }
                      L9: {
                        if (ja.field_F) {
                          param2 = oa.field_F;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      me.field_f.a(-10, param2, param1);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (256 == param1) {
                    break L2;
                  } else {
                    if (param1 != 10) {
                      if (fk.field_a) {
                        break L2;
                      } else {
                        j.field_e.k(-112);
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("pc.S(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    static {
        field_R = 640;
        field_P = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
