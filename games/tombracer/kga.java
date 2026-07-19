/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kga extends dg {
    private bua field_s;
    private int field_p;
    private int field_r;
    private int field_t;
    private int field_m;
    static String field_q;
    static dn field_o;
    static eua field_n;

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
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
              super.a(param0, param1, param2);
              if (this.a(127).field_E >= 20) {
                break L1;
              } else {
                this.a(param1, -2159, param0);
                break L1;
              }
            }
            if (0 != this.field_t) {
              break L0;
            } else {
              this.field_s = new bua(3, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("kga.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ue var7 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2);
                if (!(param2 instanceof ue)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            var7 = (ue) ((Object) param2);
                            var5 = var7.j((byte) -77);
                            if (var5 != 0) {
                              break L7;
                            } else {
                              if (var6 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var5 == 3) {
                            break L5;
                          } else {
                            L8: {
                              if (var5 != 1) {
                                break L8;
                              } else {
                                if (var6 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (-3 != (var5 ^ -1)) {
                              break L3;
                            } else {
                              if (var6 == 0) {
                                this.field_t = 1;
                                break L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        this.field_t = 3;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                      this.field_t = 2;
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    this.field_t = 0;
                    if (var6 == 0) {
                      break L3;
                    } else {
                      this.field_t = 1;
                      break L3;
                    }
                  }
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L9: {
                if (!(param2 instanceof rl)) {
                  break L9;
                } else {
                  this.field_t = 5;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (!(param2 instanceof ok)) {
                  break L10;
                } else {
                  this.field_t = 5;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L10;
                  }
                }
              }
              if (param2 instanceof ef) {
                this.field_t = 4;
                break L1;
              } else {
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var4);
            stackOut_31_1 = new StringBuilder().append("kga.C(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        ka stackIn_24_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        ka stackOut_23_0 = null;
        ka stackOut_22_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null != this.field_h) {
              L1: {
                if (this.field_k instanceof pd) {
                  if (((pd) ((Object) this.field_k)).c(-72)) {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L1;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_9_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var6_int = stackIn_9_0;
                  var7 = null;
                  var8 = this.field_t;
                  if (var8 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (-2 != (var8 ^ -1)) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          var7 = rl.field_t[1];
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var8 != 2) {
                        break L5;
                      } else {
                        if (var10 == 0) {
                          var7 = rl.field_t[2];
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (3 == var8) {
                      var7 = rl.field_t[4];
                      break L2;
                    } else {
                      if ((var8 ^ -1) == -5) {
                        var7 = rl.field_t[5];
                        break L2;
                      } else {
                        if ((var8 ^ -1) != -6) {
                          break L2;
                        } else {
                          if (var10 == 0) {
                            var7 = rl.field_t[7];
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (var6_int == 0) {
                    stackOut_23_0 = rl.field_t[0];
                    stackIn_24_0 = stackOut_23_0;
                    break L6;
                  } else {
                    stackOut_22_0 = this.field_s.b((byte) 74);
                    stackIn_24_0 = stackOut_22_0;
                    break L6;
                  }
                }
                var7 = stackIn_24_0;
                if (var6_int != 0) {
                  this.field_s.a(3, false, (byte) -84, 9);
                  var7 = this.field_s.b((byte) 74);
                  break L2;
                } else {
                  break L2;
                }
              }
              L7: {
                var8 = 73 / ((-38 - param4) / 47);
                if (var6_int == 0) {
                  param3 = param3 + this.field_r;
                  break L7;
                } else {
                  if (this.field_t != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var7 == null) {
                  break L8;
                } else {
                  var9 = dfa.a(-this.field_h.g(-25787) + 4096 - -this.field_m >> 414378818, 2048, -117);
                  gqa.a(var9, -83584144, param1, param2, (ka) (var7), param3);
                  break L8;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var6);
            stackOut_40_1 = new StringBuilder().append("kga.D(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    public static void n(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != 9) {
            return;
        }
        field_q = null;
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(124, param1, param2);
              if (param0 > 119) {
                break L1;
              } else {
                this.f(88);
                break L1;
              }
            }
            if (-21 >= (param1.field_E ^ -1)) {
              this.field_t = param2.b((byte) 44, 4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("kga.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static void i(int param0) {
        qpa.a(275, ht.field_Pb, 3, 40, 440, 126, 200);
        qpa.a(275, cla.field_n, 5, 40, 440, 126, 200);
        qpa.a(275, se.field_s, 6, 40, 440, 124, 200);
        qpa.a(335, jta.field_z, 9, 40, 440, 125, 200);
        if (param0 < 97) {
            cka var2 = (cka) null;
            kga.a((cka) null, -2);
        }
    }

    kga(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_m = 0;
        this.field_p = 0;
    }

    public final void f(int param0) {
        super.f(param0 ^ 0);
        if (param0 == -4366) {
          L0: {
            if (null != this.field_s) {
              this.field_s.a(0);
              break L0;
            } else {
              break L0;
            }
          }
          if ((this.field_t ^ -1) != -2) {
            if ((this.field_t ^ -1) == -3) {
              return;
            } else {
              this.field_p = this.field_p + 32;
              this.field_m = this.field_m + 96;
              this.field_r = 524288 + hua.a((byte) 119, dfa.a(this.field_p, 2048, -122)) * 8;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -58, param1);
            param1.a((byte) 61, this.field_t, 4);
            int var3_int = 15 % ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kga.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(cka param0, int param1) {
        RuntimeException runtimeException = null;
        ama var7 = null;
        dca var9 = null;
        mq var11 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
              if (hna.field_e != null) {
                break L1;
              } else {
                var7 = new ama();
                var19 = var7.a(16, 128, 0, 128);
                hna.field_e = bw.a(270, var19, false);
                break L1;
              }
            }
            L2: {
              if (null != gu.field_l) {
                break L2;
              } else {
                var9 = new dca();
                var20 = var9.a(128, 16, 123, 128);
                gu.field_l = bw.a(270, var20, false);
                break L2;
              }
            }
            L3: {
              var11 = param0.field_zc;
              if (param1 >= 116) {
                break L3;
              } else {
                kga.n((byte) 16);
                break L3;
              }
            }
            L4: {
              if (!var11.a((byte) 89)) {
                break L4;
              } else {
                if (uga.field_m == null) {
                  var21 = gaa.a(4.0f, 16.0f, 128, new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
                  uga.field_m = bw.a(270, var21, false);
                  break L4;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("kga.F(");
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void b(byte param0, int param1) {
        this.field_t = param1;
        if (param0 <= 73) {
            cka var4 = (cka) null;
            kga.a((cka) null, 79);
        }
    }

    kga(int param0) {
        super(param0);
        this.field_m = 0;
        this.field_p = 0;
    }

    static {
        field_q = "Bouncy Fireballs";
        field_o = new dn();
    }
}
