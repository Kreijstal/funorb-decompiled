/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    private String field_c;
    private wk field_b;
    private int field_p;
    private ru[] field_i;
    private dl field_h;
    private String[] field_k;
    static byte[][] field_d;
    private int field_n;
    private int field_l;
    private wk field_t;
    private int field_r;
    private wk field_m;
    static int field_a;
    private boolean field_s;
    private int field_f;
    static String field_e;
    static gu field_g;
    private int field_q;
    static String field_o;
    static String field_j;

    public static void b(int param0) {
        field_g = null;
        field_o = null;
        field_d = (byte[][]) null;
        field_e = null;
        field_j = null;
        if (param0 != -8616) {
            oo.b(85);
        }
    }

    private final void a(String param0, byte param1, ru[] param2, java.applet.Applet param3, boolean param4, String[] param5) {
        RuntimeException runtimeException = null;
        String var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var7 = param3.getParameter("currency");
                if (var7 == null) {
                  break L2;
                } else {
                  if (!vv.a(-84, (CharSequence) ((Object) var7))) {
                    break L2;
                  } else {
                    this.field_r = dq.a(param1 + 2, (CharSequence) ((Object) var7));
                    if (!ArmiesOfGielinor.field_M) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_r = 2;
              break L1;
            }
            this.field_c = param0;
            this.field_h = new dl(2);
            this.field_k = param5;
            if (param1 == 71) {
              L3: {
                this.field_i = param2;
                if (null == this.field_i) {
                  break L3;
                } else {
                  if (3 > this.field_i.length) {
                    break L3;
                  } else {
                    mk.field_h = param4;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException("");
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("oo.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param4).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int stackIn_46_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_110_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_109_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_l = this.field_l + 65536;
        L0: while (true) {
          L1: {
            L2: {
              if (ev.b(-101, qk.field_d, this.field_l) < 65536) {
                break L2;
              } else {
                this.field_l = this.field_l - qk.field_d;
                this.field_f = this.field_f + 1;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param1 <= -95) {
              break L1;
            } else {
              var7 = (int[]) null;
              this.a((wk) null, 114, -82, (String) null, (ka) null, (int[]) null, 110, 33, 0, 0.8778258562088013f);
              break L1;
            }
          }
          L3: {
            var3 = -1;
            if (this.field_i != null) {
              var3 = this.field_i.length;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            L5: {
              L6: {
                if (var3 != -1) {
                  break L6;
                } else {
                  L7: {
                    if (null == mg.field_d) {
                      break L7;
                    } else {
                      L8: {
                        var4 = 0;
                        if (tr.field_A == 0) {
                          break L8;
                        } else {
                          if ((ur.field_z ^ -1) >= -258) {
                            break L8;
                          } else {
                            if (290 > ur.field_z) {
                              L9: {
                                if (9 >= iu.field_t) {
                                  break L9;
                                } else {
                                  if (82 > iu.field_t) {
                                    var4 = 1;
                                    this.field_p = qk.field_c;
                                    this.field_s = false;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (558 >= iu.field_t) {
                                break L8;
                              } else {
                                if (631 <= iu.field_t) {
                                  break L8;
                                } else {
                                  var4 = 1;
                                  this.field_p = qk.field_c;
                                  this.field_s = true;
                                  break L8;
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L7;
                      } else {
                        if (this.field_p <= qk.field_a) {
                          break L7;
                        } else {
                          if (257 >= ur.field_z) {
                            break L7;
                          } else {
                            if (290 <= ur.field_z) {
                              break L7;
                            } else {
                              L10: {
                                if ((sm.field_d ^ -1) >= -10) {
                                  break L10;
                                } else {
                                  if (-83 < (sm.field_d ^ -1)) {
                                    this.field_p = qk.field_a;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (558 >= sm.field_d) {
                                break L7;
                              } else {
                                if (631 > sm.field_d) {
                                  this.field_p = qk.field_a;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param0) {
                    L11: {
                      this.field_h.a(0, this.a(iu.field_t, ur.field_z, -387), this.a(sm.field_d, ko.field_b, -387));
                      var4 = 0;
                      if (!this.field_h.d((byte) 96)) {
                        break L11;
                      } else {
                        L12: {
                          if (0 == this.field_h.field_h) {
                            var4 = 1;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        if (this.field_h.field_h != 1) {
                          break L11;
                        } else {
                          return 2;
                        }
                      }
                    }
                    if (!mk.field_h) {
                      break L5;
                    } else {
                      L13: while (true) {
                        if (!jd.i((byte) -71)) {
                          break L5;
                        } else {
                          var5 = this.c(127);
                          stackOut_45_0 = 0;
                          stackIn_110_0 = stackOut_45_0;
                          stackIn_46_0 = stackOut_45_0;
                          if (var6 != 0) {
                            break L4;
                          } else {
                            if (stackIn_46_0 != var5) {
                              return var5;
                            } else {
                              if (var6 == 0) {
                                continue L13;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              }
              L14: {
                if (qk.field_c > this.field_p) {
                  L15: {
                    L16: {
                      this.field_p = this.field_p + 1;
                      if (this.field_p <= qk.field_a) {
                        break L16;
                      } else {
                        if (null == this.field_i) {
                          break L15;
                        } else {
                          if (this.field_i[this.field_n] == null) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (qk.field_c > this.field_p) {
                      break L14;
                    } else {
                      if (this.field_i[(this.field_n - -1) % var3] == null) {
                        this.field_p = this.field_p - 1;
                        if (var6 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  this.field_p = this.field_p - 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              L17: {
                if (this.field_p < qk.field_c) {
                  break L17;
                } else {
                  L18: {
                    this.field_q = this.field_n;
                    this.field_p = this.field_p - qk.field_c;
                    if (this.field_s) {
                      break L18;
                    } else {
                      this.field_n = this.field_n - 1;
                      if (0 > this.field_n) {
                        this.field_n = this.field_n + var3;
                        if (var6 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  this.field_n = this.field_n + 1;
                  if (var3 > this.field_n) {
                    break L17;
                  } else {
                    this.field_n = this.field_n - var3;
                    break L17;
                  }
                }
              }
              L19: {
                if (this.field_p <= qk.field_a) {
                  break L19;
                } else {
                  this.field_s = true;
                  break L19;
                }
              }
              L20: {
                if (null == mg.field_d) {
                  break L20;
                } else {
                  L21: {
                    var4 = 0;
                    if (tr.field_A == 0) {
                      break L21;
                    } else {
                      if ((ur.field_z ^ -1) >= -258) {
                        break L21;
                      } else {
                        if (290 > ur.field_z) {
                          L22: {
                            if (9 >= iu.field_t) {
                              break L22;
                            } else {
                              if (82 > iu.field_t) {
                                var4 = 1;
                                this.field_p = qk.field_c;
                                this.field_s = false;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                          }
                          if (558 >= iu.field_t) {
                            break L21;
                          } else {
                            if (631 <= iu.field_t) {
                              break L21;
                            } else {
                              var4 = 1;
                              this.field_p = qk.field_c;
                              this.field_s = true;
                              break L21;
                            }
                          }
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L20;
                  } else {
                    if (this.field_p <= qk.field_a) {
                      break L20;
                    } else {
                      if (257 >= ur.field_z) {
                        break L20;
                      } else {
                        if (290 <= ur.field_z) {
                          break L20;
                        } else {
                          L23: {
                            if ((sm.field_d ^ -1) >= -10) {
                              break L23;
                            } else {
                              if (-83 < (sm.field_d ^ -1)) {
                                this.field_p = qk.field_a;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if (558 >= sm.field_d) {
                            break L20;
                          } else {
                            if (631 > sm.field_d) {
                              this.field_p = qk.field_a;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (param0) {
                L24: {
                  this.field_h.a(0, this.a(iu.field_t, ur.field_z, -387), this.a(sm.field_d, ko.field_b, -387));
                  var4 = 0;
                  if (!this.field_h.d((byte) 96)) {
                    break L24;
                  } else {
                    L25: {
                      if (0 == this.field_h.field_h) {
                        var4 = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    if (this.field_h.field_h != 1) {
                      break L24;
                    } else {
                      return 2;
                    }
                  }
                }
                if (!mk.field_h) {
                  break L5;
                } else {
                  L26: while (true) {
                    if (!jd.i((byte) -71)) {
                      break L5;
                    } else {
                      var5 = this.c(127);
                      stackOut_104_0 = 0;
                      stackIn_110_0 = stackOut_104_0;
                      stackIn_105_0 = stackOut_104_0;
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (stackIn_105_0 != var5) {
                          return var5;
                        } else {
                          if (var6 == 0) {
                            continue L26;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                return 0;
              }
            }
            stackOut_109_0 = var4;
            stackIn_110_0 = stackOut_109_0;
            break L4;
          }
          if (stackIn_110_0 != 0) {
            this.b((byte) -92);
            return 3;
          } else {
            return 0;
          }
        }
    }

    private final void b(byte param0) {
        try {
            rf.a(32767, ag.d((byte) 73));
            if (param0 >= -84) {
                this.field_n = 29;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final int c(int param0) {
        int discarded$2 = 0;
        L0: {
          if (param0 > 126) {
            break L0;
          } else {
            discarded$2 = this.c(-121);
            break L0;
          }
        }
        L1: {
          this.field_h.b((byte) -120);
          if (!this.field_h.d((byte) 73)) {
            break L1;
          } else {
            if (this.field_h.field_h != 0) {
              if (-2 == (this.field_h.field_h ^ -1)) {
                return 1;
              } else {
                break L1;
              }
            } else {
              this.b((byte) -95);
              return 3;
            }
          }
        }
        if (-14 == (rs.field_q ^ -1)) {
          return 1;
        } else {
          return 0;
        }
    }

    private final void a(int[] param0, int param1, String param2, int param3, ka param4, byte param5, int param6, int param7) {
        int discarded$5 = 0;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            rq.a((byte) -56);
            var9_int = param7;
            L1: while (true) {
              L2: {
                if (var9_int >= param6) {
                  rf.b(-18862);
                  break L2;
                } else {
                  qn.f(param3, var9_int, param1, var9_int + 1);
                  var10 = var9_int * param0.length / param6;
                  var11 = param0[param0.length - var10 + -1];
                  discarded$5 = param4.a(param2, param3, param7, param1, param6, var11, -1, 1, 1, 0);
                  var9_int++;
                  if (var12 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                if (param5 >= 62) {
                  break L3;
                } else {
                  field_e = (String) null;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var9);
            stackOut_10_1 = new StringBuilder().append("oo.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        qn.a(9, 9, 622, 47, 4540749, 65793);
        qn.f(9, 257, 622, 33, 2585);
        qn.a(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L0: while (true) {
          L1: {
            L2: {
              if (4 <= var2) {
                break L2;
              } else {
                qn.a(var3, 331, 117, 90, 460551, 3881787);
                var2++;
                var3 += 121;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = 0;
            break L1;
          }
          L3: {
            if (param0 >= 106) {
              break L3;
            } else {
              this.a((byte) -43);
              break L3;
            }
          }
          var3 = 299;
          L4: while (true) {
            L5: {
              if (var2 >= 2) {
                this.d(1439);
                break L5;
              } else {
                qn.a(508, var3, 127, 42, 1130115, 3365268);
                qn.f(508, 42 + var3, 127, 42, 12410);
                var3 += 91;
                var2++;
                if (var4 != 0) {
                  break L5;
                } else {
                  continue L4;
                }
              }
            }
            L6: {
              if (null == iw.field_p) {
                break L6;
              } else {
                if (!iw.field_p.a((byte) 82)) {
                  break L6;
                } else {
                  if (!iw.field_p.a(28979, "members_expansion_screen")) {
                    break L6;
                  } else {
                    if (!iw.field_p.a(28979, "arialish12")) {
                      break L6;
                    } else {
                      if (!iw.field_p.a(28979, "pump32")) {
                        break L6;
                      } else {
                        if (bh.field_H == null) {
                          break L6;
                        } else {
                          if (!bh.field_H.a((byte) 82)) {
                            break L6;
                          } else {
                            if (!bh.field_H.a(28979, "arialish12")) {
                              break L6;
                            } else {
                              if (!bh.field_H.a(28979, "pump32")) {
                                break L6;
                              } else {
                                mc.field_a = pv.a("members_expansion_screen", "frame", iw.field_p, 24914);
                                mg.field_d = ic.a("arrow", (byte) 51, "members_expansion_screen", iw.field_p);
                                ll.field_Sb = gs.a("arialish12", iw.field_p, bh.field_H, (byte) -53, "");
                                kt.field_n = it.a("", iw.field_p, bh.field_H, (byte) -87, "pump32");
                                hr.field_b = nh.a("benefit_orbs", "members_expansion_screen", iw.field_p, false);
                                ar.field_D = nh.a("button_text", "members_expansion_screen", iw.field_p, false);
                                nh.field_G = ac.a(iw.field_p, "button_highlights", (byte) -4, "members_expansion_screen");
                                bh.field_H = null;
                                iw.field_p = null;
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            this.a((byte) -124);
            if (mc.field_a != null) {
              L7: {
                this.field_b.g(376, 339);
                this.field_t.g(9, 9);
                mc.field_a.a(0, 0);
                if (mg.field_d != null) {
                  mg.field_d.g(9, 257);
                  mg.field_d.d(558, 257);
                  if ((ko.field_b ^ -1) >= -258) {
                    break L7;
                  } else {
                    if ((ko.field_b ^ -1) <= -291) {
                      break L7;
                    } else {
                      var2 = (40 * sr.c(this.field_f << -1173839804, 127) >> 263324176) + 40;
                      if ((var2 ^ -1) >= -1) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            if (-10 <= (sm.field_d ^ -1)) {
                              break L9;
                            } else {
                              if (sm.field_d < 82) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if ((sm.field_d ^ -1) >= -559) {
                            break L7;
                          } else {
                            if ((sm.field_d ^ -1) > -632) {
                              mg.field_d.h();
                              mg.field_d.f(557, 256, var2);
                              mg.field_d.f(559, 256, var2);
                              mg.field_d.f(557, 258, var2);
                              mg.field_d.f(559, 258, var2);
                              mg.field_d.h();
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        mg.field_d.f(8, 256, var2);
                        mg.field_d.f(10, 256, var2);
                        mg.field_d.f(8, 258, var2);
                        mg.field_d.f(10, 258, var2);
                        break L7;
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L10: {
                L11: {
                  this.field_m.g(16, 302);
                  discarded$4 = ll.field_Sb.a(this.field_k[this.field_n], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                  hr.field_b.g(30, 330);
                  discarded$5 = ll.field_Sb.a(db.field_e[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                  discarded$6 = ll.field_Sb.a(db.field_e[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                  discarded$7 = ll.field_Sb.a(db.field_e[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                  ar.field_D.g((127 - ar.field_D.field_A) / 2 + 508, 315);
                  if (0 != this.field_h.field_h) {
                    break L11;
                  } else {
                    nh.field_G[0].g(508, 299);
                    if (var4 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if ((this.field_h.field_h ^ -1) == -2) {
                  nh.field_G[1].g(508, 387);
                  break L10;
                } else {
                  break L10;
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void d(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        ru var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ru var6 = null;
        ru var7 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == this.field_i) {
          L0: {
            if (null == ll.field_Sb) {
              break L0;
            } else {
              discarded$2 = ll.field_Sb.a(ef.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 == 1439) {
              break L1;
            } else {
              field_a = -111;
              break L1;
            }
          }
          L2: {
            var6 = this.field_i[this.field_n];
            var2 = var6;
            if (var2 == null) {
              if (ll.field_Sb == null) {
                break L2;
              } else {
                discarded$3 = ll.field_Sb.a(ef.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                if (var5 == 0) {
                  break L2;
                } else {
                  var6.a(9, 58);
                  break L2;
                }
              }
            } else {
              var6.a(9, 58);
              break L2;
            }
          }
          L3: {
            if (this.field_p >= qk.field_a) {
              break L3;
            } else {
              var7 = this.field_i[this.field_q];
              var2 = var7;
              if (var2 != null) {
                L4: {
                  var3 = this.field_p * (var7.field_g - -60) / qk.field_a;
                  var4 = var3 - 30;
                  if (!this.field_s) {
                    break L4;
                  } else {
                    rb.a(58, param0 ^ -1708085583, 9, var4 * -256 / 30, 256 * (-var4 + var7.field_g) / 30, var7);
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                rb.a(58, -1708086482, 9, 256 * (var7.field_g + -var4) / 30, var4 * -256 / 30, var7);
                break L3;
              } else {
                break L3;
              }
            }
          }
          return;
        }
    }

    private final void a(wk param0, int param1, int param2, String param3, ka param4, int[] param5, int param6, int param7, int param8, float param9) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        wk var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var11_int = (int)((float)param8 / param9);
              var12 = (int)((float)param7 / param9);
              var13 = new wk(var11_int, var12);
              vn.a(var13, 3);
              if (param6 < -108) {
                break L1;
              } else {
                oo.b(-32);
                break L1;
              }
            }
            param0.c((int)((float)(-param2) / param9), (int)((float)(-param1) / param9), (int)((float)param0.field_y / param9), (int)((float)param0.field_v / param9));
            this.a(param5, var11_int, param3, 0, param4, (byte) 79, var12, 0);
            rf.b(-18862);
            vn.a(param0, 3);
            var13.d(param2, param1, param8, param7);
            rf.b(-18862);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var11);
            stackOut_4_1 = new StringBuilder().append("oo.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (mc.field_a == null) {
          return -1;
        } else {
          L0: {
            if (-509 < (param0 ^ -1)) {
              break L0;
            } else {
              if (635 <= param0) {
                break L0;
              } else {
                if ((param1 ^ -1) > -300) {
                  break L0;
                } else {
                  if (-387 < (param1 ^ -1)) {
                    return 0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L1: {
            if (-509 < (param0 ^ -1)) {
              break L1;
            } else {
              if ((param0 ^ -1) <= -636) {
                break L1;
              } else {
                if (param1 < 390) {
                  break L1;
                } else {
                  if (475 <= param1) {
                    break L1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
          if (param2 != -387) {
            return -86;
          } else {
            return -1;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        wk var5 = null;
        String var6 = null;
        String var7 = null;
        ka var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        L0: {
          if (this.field_t != null) {
            break L0;
          } else {
            if (null == kt.field_n) {
              break L0;
            } else {
              L1: {
                this.field_t = new wk(622, 47);
                vn.a(this.field_t, 3);
                qn.a(0, 0, 622, 47, 4540749, 65793);
                var2 = 16448250;
                var3 = 10068666;
                var12 = cj.a(var3, var2, -60);
                var11 = var12;
                var9 = var11;
                this.a(var12, 622, this.field_c, 0, kt.field_n, (byte) 66, 47, 0);
                rf.b(-18862);
                this.field_m = new wk(475, 24);
                this.a(this.field_m, -4, 0, hr.field_h, kt.field_n, var9, -124, 24, 475, 0.75f);
                if (param0 < -103) {
                  break L1;
                } else {
                  var8 = (ka) null;
                  this.a((int[]) null, -60, (String) null, -5, (ka) null, (byte) 31, 126, -81);
                  break L1;
                }
              }
              var10 = cj.a(526344, 526344, 126);
              var5 = new wk(121, 122);
              vn.a(var5, 3);
              qn.a(0, 0, var5.field_y, var5.field_v / 2, 16180917, 16306250);
              qn.a(0, var5.field_v / 2, var5.field_y, var5.field_v, 16306250, 15568919);
              var6 = rv.field_a;
              var7 = wp.field_B;
              this.a(var5, -16, 0, var6, kt.field_n, var10, -112, var5.field_v, var5.field_y, 0.5f);
              this.a(var5, 20, 0, var7, kt.field_n, var10, -123, var5.field_v, var5.field_y, 0.5f);
              this.a(var5, 12 + -kt.field_n.field_H + var5.field_v / 2, 0, qb.field_c[this.field_r], kt.field_n, var10, -125, var5.field_v / 3, var5.field_y, 0.699999988079071f);
              rf.b(-18862);
              this.field_b = new wk(121, 122);
              vn.a(this.field_b, 3);
              var5.a(this.field_b.field_y / 2, this.field_b.field_v / 2, -2048, 4096);
              rf.b(-18862);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var7 = -43 % ((param6 - 19) / 62);
            var8 = 0;
            if ((sr.a(param3 + -1, param5, 2, (byte) -113) ^ -1) == -3) {
              break L1;
            } else {
              if (4 != sr.a(-1 + param3, param5, 2, (byte) -104)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var8++;
          break L0;
        }
        L2: {
          L3: {
            if (-3 == (sr.a(param3, 1 + param5, 2, (byte) -113) ^ -1)) {
              break L3;
            } else {
              if (-5 != (sr.a(param3, 1 + param5, 2, (byte) -100) ^ -1)) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var8 += 2;
          break L2;
        }
        L4: {
          if ((var8 & 1) > 0) {
            ac.field_k[2].b(-32 + param4, param1 + 10, param0, param2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((var8 & 2 ^ -1) >= -1) {
            break L5;
          } else {
            ac.field_k[2].b(8 + param4, 10 + param1, param0, param2);
            break L5;
          }
        }
    }

    final static void e(int param0) {
        L0: {
          L1: {
            if (rd.field_j != null) {
              break L1;
            } else {
              if (bc.field_a != null) {
                oa.a(102, bc.field_a.field_d);
                if (!ArmiesOfGielinor.field_M) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L0;
              }
            }
          }
          oa.a(90, rd.field_j.field_d);
          break L0;
        }
        L2: {
          if (param0 == -387) {
            break L2;
          } else {
            field_o = (String) null;
            break L2;
          }
        }
    }

    oo(java.applet.Applet param0, String param1, ru[] param2, String[] param3) {
        this.field_l = 0;
        this.field_s = true;
        this.field_f = 0;
        try {
            this.a(param1, (byte) 71, param2, param0, true, param3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "oo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new byte[250][];
        field_e = "Full screen";
        field_g = new gu();
        field_o = "This <%0> is currently wearing <%2>. Are you sure you wish to replace it with <%1>? The <%2> will be lost forever if you do this.";
        field_j = "Try again";
    }
}
