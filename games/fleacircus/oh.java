/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oh extends jj {
    private int field_ab;
    private qa field_ib;
    private int field_eb;
    private ak field_fb;
    static int field_db;
    private tf field_hb;
    private int field_cb;
    private int field_gb;
    private int field_bb;
    static String field_jb;

    final void l(int param0) {
        if (this.field_fb != null) {
          if (fl.field_e == this.field_fb) {
            this.field_hb.field_F = 256;
            this.field_fb = null;
            super.l(param0);
            return;
          } else {
            this.a(this.field_ib.field_j + (this.field_gb + 12), (byte) -128, this.field_ib.field_u + 12);
            this.c(this.field_ib, 115);
            this.field_hb.field_F = 256;
            this.field_fb = null;
            super.l(param0);
            return;
          }
        } else {
          super.l(param0);
          return;
        }
    }

    final static void a(rh param0, rh param1, boolean param2, byte param3, rh param4) {
        dd discarded$0 = null;
        try {
            uc.field_c = pk.a((byte) 68, "");
            uc.field_c.a(false, 10518);
            j.a(param4, param1, param3 ^ 31756, param0);
            if (param3 != 28) {
                discarded$0 = oh.c(2, -119, 119);
            }
            mg.a(-125);
            ui.field_kb = ql.field_l;
            cb.field_v = ql.field_l;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "oh.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (null != this.field_fb) {
          if (this.field_fb == rk.field_w) {
            fieldTemp$4 = this.field_eb + 1;
            this.field_eb = this.field_eb + 1;
            if (fieldTemp$4 != this.field_ab) {
              this.field_hb.field_F = -((this.field_eb << -2050684568) / this.field_ab) + 256;
              if (var3 != 0) {
                this.field_fb = ml.field_I;
                this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
                this.field_hb.field_F = 0;
                this.field_eb = 0;
                var2 = -59 / ((38 - param0) / 49);
                return super.a(-57);
              } else {
                var2 = -59 / ((38 - param0) / 49);
                return super.a(-57);
              }
            } else {
              this.field_fb = ml.field_I;
              this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
              this.field_hb.field_F = 0;
              this.field_eb = 0;
              var2 = -59 / ((38 - param0) / 49);
              return super.a(-57);
            }
          } else {
            if (this.field_fb == fl.field_e) {
              fieldTemp$5 = this.field_eb + 1;
              this.field_eb = this.field_eb + 1;
              if (this.field_cb == fieldTemp$5) {
                this.field_fb = null;
                this.field_hb.field_F = 256;
                if (var3 != 0) {
                  fieldTemp$6 = this.field_eb + 1;
                  this.field_eb = this.field_eb + 1;
                  if (fieldTemp$6 != this.field_ab) {
                    this.field_hb.field_F = -((this.field_eb << -2050684568) / this.field_ab) + 256;
                    if (var3 != 0) {
                      this.field_fb = ml.field_I;
                      this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
                      this.field_hb.field_F = 0;
                      this.field_eb = 0;
                      var2 = -59 / ((38 - param0) / 49);
                      return super.a(-57);
                    } else {
                      var2 = -59 / ((38 - param0) / 49);
                      return super.a(-57);
                    }
                  } else {
                    this.field_fb = ml.field_I;
                    this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
                    this.field_hb.field_F = 0;
                    this.field_eb = 0;
                    var2 = -59 / ((38 - param0) / 49);
                    return super.a(-57);
                  }
                } else {
                  var2 = -59 / ((38 - param0) / 49);
                  return super.a(-57);
                }
              } else {
                this.field_hb.field_F = (this.field_eb << 825741992) / this.field_cb;
                if (var3 != 0) {
                  this.field_fb = null;
                  this.field_hb.field_F = 256;
                  if (var3 != 0) {
                    fieldTemp$7 = this.field_eb + 1;
                    this.field_eb = this.field_eb + 1;
                    if (fieldTemp$7 != this.field_ab) {
                      this.field_hb.field_F = -((this.field_eb << -2050684568) / this.field_ab) + 256;
                      if (var3 == 0) {
                        var2 = -59 / ((38 - param0) / 49);
                        return super.a(-57);
                      } else {
                        this.field_fb = ml.field_I;
                        this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
                        this.field_hb.field_F = 0;
                        this.field_eb = 0;
                        var2 = -59 / ((38 - param0) / 49);
                        return super.a(-57);
                      }
                    } else {
                      this.field_fb = ml.field_I;
                      this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), -95);
                      this.field_hb.field_F = 0;
                      this.field_eb = 0;
                      var2 = -59 / ((38 - param0) / 49);
                      return super.a(-57);
                    }
                  } else {
                    var2 = -59 / ((38 - param0) / 49);
                    return super.a(-57);
                  }
                } else {
                  var2 = -59 / ((38 - param0) / 49);
                  return super.a(-57);
                }
              }
            } else {
              var2 = -59 / ((38 - param0) / 49);
              return super.a(-57);
            }
          }
        } else {
          var2 = -59 / ((38 - param0) / 49);
          return super.a(-57);
        }
    }

    final void m(int param0) {
        if (!(rk.field_w != this.field_fb)) {
            return;
        }
        this.field_eb = 0;
        this.field_fb = fl.field_e;
        this.c(this.field_ib, 99);
        this.field_hb.field_F = 0;
        this.field_ib = null;
        int var2 = 89 % ((-56 - param0) / 45);
    }

    oh(f param0, qa param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_u, param1.field_j + (12 - -param2));
        try {
            this.field_bb = param4;
            this.field_gb = param2;
            this.field_cb = param3;
            this.field_ab = param3;
            this.c(param1, 98);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void c(qa param0, int param1) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              if (null != this.field_hb) {
                this.field_hb.c(-1);
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
                  param0.a(6, param0.field_u, 6 + this.field_gb, param0.field_j, 80);
                  this.field_hb = new tf(param0);
                  if (!fleas.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_hb = new tf();
              break L2;
            }
            this.a((qa) (this.field_hb), (byte) -85);
            if (param1 > 79) {
              this.field_ib = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("oh.DB(");
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static dd c(int param0, int param1, int param2) {
        dd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        dd stackIn_4_0 = null;
        dd stackIn_5_0 = null;
        dd stackOut_3_0 = null;
        var6 = fleas.field_A ? 1 : 0;
        var3 = new dd(param2, param2);
        var4 = 0;
        var5 = 73 % ((param0 - 37) / 48);
        L0: while (true) {
          if (var3.field_B.length > var4) {
            stackOut_3_0 = (dd) (var3);
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var6 == 0) {
              stackIn_5_0.field_B[var4] = param1;
              var4++;
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return var3;
          }
        }
    }

    public static void f(byte param0) {
        dd discarded$0 = null;
        field_jb = null;
        if (param0 >= -86) {
            discarded$0 = oh.c(73, 19, -11);
        }
    }

    void d(qa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              L2: {
                this.field_ib = param0;
                if (ml.field_I == this.field_fb) {
                  break L2;
                } else {
                  if (this.field_fb == rk.field_w) {
                    break L1;
                  } else {
                    this.field_eb = 0;
                    this.field_fb = rk.field_w;
                    if (!fleas.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.a(this.field_bb, 12 - -this.field_ib.field_u, 12 - (-this.field_gb - this.field_ib.field_j), 122);
              this.field_eb = 0;
              break L1;
            }
            L3: {
              if (param1 == 26034) {
                break L3;
              } else {
                this.m(-84);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("oh.IA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static void d(boolean param0) {
        if (param0) {
          field_jb = (String) null;
          ol.field_d = new ca();
          ak.field_a.d(ol.field_d, 26034);
          return;
        } else {
          ol.field_d = new ca();
          ak.field_a.d(ol.field_d, 26034);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = fleas.field_A ? 1 : 0;
        if (param8 < param11) {
          if (param0 <= param11) {
            if (param0 <= param8) {
              pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
              if (param5 == 0) {
                return;
              } else {
                field_jb = (String) null;
                return;
              }
            } else {
              pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
              if (var17 == 0) {
                if (param5 == 0) {
                  return;
                } else {
                  field_jb = (String) null;
                  return;
                }
              } else {
                pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
                if (param5 == 0) {
                  return;
                } else {
                  field_jb = (String) null;
                  return;
                }
              }
            }
          } else {
            pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
            if (var17 != 0) {
              if (param0 <= param8) {
                pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
                if (param5 == 0) {
                  return;
                } else {
                  field_jb = (String) null;
                  return;
                }
              } else {
                pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
                if (var17 == 0) {
                  if (param5 == 0) {
                    return;
                  } else {
                    field_jb = (String) null;
                    return;
                  }
                } else {
                  pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
                  if (param5 != 0) {
                    field_jb = (String) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param5 != 0) {
                field_jb = (String) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param8 < param0) {
            pa.a(param9, param8, param4, param12, param14, param15, param2, param11, param6, param3, param7, gb.field_a, param1, param13, param0, 32679, param10);
            if (var17 != 0) {
              if (param0 <= param11) {
                pa.a(param6, param11, param2, param15, param4, param3, param14, param0, param1, param12, param10, gb.field_a, param9, param7, param8, 32679, param13);
                if (var17 != 0) {
                  L0: {
                    L1: {
                      if (param0 <= param11) {
                        break L1;
                      } else {
                        pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
                        if (var17 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L2: {
                      if (param0 <= param8) {
                        break L2;
                      } else {
                        pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
                        if (var17 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
                    break L0;
                  }
                  if (param5 != 0) {
                    field_jb = (String) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param5 != 0) {
                    field_jb = (String) null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                pa.a(param1, param0, param2, param12, param14, param3, param4, param11, param6, param15, param7, gb.field_a, param9, param10, param8, param5 ^ 32679, param13);
                if (var17 == 0) {
                  if (param5 != 0) {
                    field_jb = (String) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    pa.a(param6, param11, param2, param15, param4, param3, param14, param0, param1, param12, param10, gb.field_a, param9, param7, param8, 32679, param13);
                    if (param0 <= param11) {
                      break L3;
                    } else {
                      pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (param0 <= param8) {
                        break L5;
                      } else {
                        pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
                        if (var17 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
                    break L4;
                  }
                  L6: {
                    if (param5 == 0) {
                      break L6;
                    } else {
                      field_jb = (String) null;
                      break L6;
                    }
                  }
                  return;
                }
              }
            } else {
              if (param5 != 0) {
                field_jb = (String) null;
                return;
              } else {
                return;
              }
            }
          } else {
            L7: {
              if (param0 <= param11) {
                pa.a(param6, param11, param2, param15, param4, param3, param14, param0, param1, param12, param10, gb.field_a, param9, param7, param8, 32679, param13);
                if (var17 == 0) {
                  break L7;
                } else {
                  L8: {
                    if (param0 <= param11) {
                      break L8;
                    } else {
                      pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      if (param0 <= param8) {
                        break L10;
                      } else {
                        pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
                        if (var17 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
                    break L9;
                  }
                  L11: {
                    if (param5 == 0) {
                      break L11;
                    } else {
                      field_jb = (String) null;
                      break L11;
                    }
                  }
                  return;
                }
              } else {
                pa.a(param1, param0, param2, param12, param14, param3, param4, param11, param6, param15, param7, gb.field_a, param9, param10, param8, param5 ^ 32679, param13);
                if (var17 == 0) {
                  break L7;
                } else {
                  L12: {
                    pa.a(param6, param11, param2, param15, param4, param3, param14, param0, param1, param12, param10, gb.field_a, param9, param7, param8, 32679, param13);
                    if (param0 <= param11) {
                      break L12;
                    } else {
                      pa.a(param6, param11, param4, param3, param2, param15, param14, param8, param9, param12, param13, gb.field_a, param1, param7, param0, 32679, param10);
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (param0 <= param8) {
                        break L14;
                      } else {
                        pa.a(param1, param0, param14, param3, param2, param12, param4, param8, param9, param15, param13, gb.field_a, param6, param10, param11, 32679, param7);
                        if (var17 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    pa.a(param9, param8, param14, param15, param4, param12, param2, param0, param1, param3, param10, gb.field_a, param6, param13, param11, param5 + 32679, param7);
                    break L13;
                  }
                  L15: {
                    if (param5 == 0) {
                      break L15;
                    } else {
                      field_jb = (String) null;
                      break L15;
                    }
                  }
                  return;
                }
              }
            }
            if (param5 != 0) {
              field_jb = (String) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean j(int param0) {
        qa var3 = null;
        this.l(-1);
        if (param0 <= 70) {
          var3 = (qa) null;
          this.d((qa) null, 45);
          return super.j(80);
        } else {
          return super.j(80);
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (super.a(param0 + 0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -2) {
                  break L1;
                } else {
                  this.l(118);
                  break L1;
                }
              }
              if (null != this.field_hb) {
                L2: {
                  if ((param1 ^ -1) == -99) {
                    discarded$4 = this.field_hb.a(param2, -61);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-100 == (param1 ^ -1)) {
                    discarded$5 = this.field_hb.a(param2, -70);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("oh.N(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    static {
        field_db = 50;
        field_jb = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
