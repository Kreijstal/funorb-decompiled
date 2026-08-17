/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends cg {
    private int[] field_t;
    l field_y;
    private l field_k;
    private int field_r;
    l field_n;
    private int field_m;
    static String field_x;
    private l field_l;
    private qua field_u;
    private boolean field_q;
    private qua field_w;
    private int[] field_o;
    private boolean field_p;
    private int field_s;
    private int field_j;
    private qua field_v;

    final cg b() {
        return null;
    }

    final synchronized void a(int param0, int param1, byte param2, int param3, boolean param4, qua param5) {
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_32_0 = 0;
        l stackIn_42_0 = null;
        qua stackIn_42_1 = null;
        l stackIn_43_0 = null;
        qua stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        l stackIn_51_0 = null;
        qua stackIn_51_1 = null;
        l stackIn_52_0 = null;
        qua stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_q) {
                break L1;
              } else {
                if (param4) {
                  L2: {
                    if (this.field_m <= 0) {
                      L3: {
                        if (this.field_w != null) {
                          this.field_l.b(2);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_w = param5;
                      if (param5 == null) {
                        break L2;
                      } else {
                        this.field_l.a(param5, false, (byte) 80);
                        this.a(1048576, param3, param0, this.field_l);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null != this.field_u) {
                          this.field_y.b(param2 ^ -42);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_u = param5;
                      if (param5 != null) {
                        this.field_y.a(param5, false, (byte) 80);
                        this.a(1048576, param3, param0, this.field_y);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackIn_19_0 = this;

              if (!param4) {
                stackIn_20_0 = this;
                stackIn_20_1 = 0;
                break L5;
              } else {
                stackIn_20_0 = this;
                stackIn_20_1 = 1;
                break L5;
              }
            }
            ((sq) (this)).field_q = stackIn_20_1 != 0;
            if (param5 == this.field_u) {
              this.field_m = param1;
              this.a(1048576, param3, param0, this.field_y);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param5 != this.field_w) {
                L6: {
                  if (this.field_u == null) {
                    var7_int = 1;
                    break L6;
                  } else {
                    if (null != this.field_w) {
                      L7: {
                        if (-524289 >= (this.field_r ^ -1)) {
                          stackIn_32_0 = 0;
                          break L7;
                        } else {
                          stackIn_32_0 = 1;
                          break L7;
                        }
                      }
                      var7_int = stackIn_32_0;
                      break L6;
                    } else {
                      var7_int = 0;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var7_int != 0) {
                    L9: {
                      if (this.field_u != null) {
                        this.field_y.b(param2 + 46);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      this.field_u = param5;
                      if (param5 == null) {
                        break L10;
                      } else {
                        L11: {
                          stackIn_51_0 = this.field_y;

                          stackIn_51_1 = (qua) (param5);

                          if (param4) {
                            stackIn_52_0 = (l) ((Object) stackIn_51_0);
                            stackIn_52_1 = (qua) ((Object) stackIn_51_1);
                            stackIn_52_2 = 0;
                            break L11;
                          } else {
                            stackIn_52_0 = (l) ((Object) stackIn_51_0);
                            stackIn_52_1 = (qua) ((Object) stackIn_51_1);
                            stackIn_52_2 = 1;
                            break L11;
                          }
                        }
                        ((l) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2 != 0, (byte) 80);
                        this.a(1048576, param3, param0, this.field_y);
                        break L10;
                      }
                    }
                    this.field_m = param1;
                    break L8;
                  } else {
                    L12: {
                      if (null != this.field_w) {
                        this.field_l.b(2);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      this.field_w = param5;
                      if (param5 != null) {
                        L14: {
                          stackIn_42_0 = this.field_l;

                          stackIn_42_1 = (qua) (param5);

                          if (param4) {
                            stackIn_43_0 = (l) ((Object) stackIn_42_0);
                            stackIn_43_1 = (qua) ((Object) stackIn_42_1);
                            stackIn_43_2 = 0;
                            break L14;
                          } else {
                            stackIn_43_0 = (l) ((Object) stackIn_42_0);
                            stackIn_43_1 = (qua) ((Object) stackIn_42_1);
                            stackIn_43_2 = 1;
                            break L14;
                          }
                        }
                        ((l) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2 != 0, (byte) 80);
                        this.a(1048576, param3, param0, this.field_l);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    this.field_m = -param1;
                    break L8;
                  }
                }
                if (param2 == -44) {
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  this.field_u = (qua) null;
                  return;
                }
              } else {
                this.field_m = -param1;
                this.a(1048576, param3, param0, this.field_l);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var7);

            stackIn_59_1 = new StringBuilder().append("sq.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L15;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_x = (String) null;
            field_x = null;
            return;
        }
        field_x = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_s > 0) {
              L1: {
                if (this.field_q) {
                  L2: {
                    if (this.field_m <= 0) {
                      break L2;
                    } else {
                      if (!this.field_y.a((byte) -72)) {
                        this.field_q = false;
                        this.field_m = -this.field_m;
                        this.field_u = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if ((this.field_m ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (!this.field_l.a((byte) -117)) {
                      this.field_q = false;
                      this.field_w = null;
                      this.field_m = -this.field_m;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_r >> 1568322092) * this.field_s / 256;
                var5 = -var4_int + this.field_s;
                if (0 != this.field_m) {
                  this.field_r = this.field_r + param2 * this.field_m;
                  if ((this.field_r ^ -1) > -1048577) {
                    if ((this.field_r ^ -1) >= -1) {
                      this.field_r = 0;
                      if (this.field_q) {
                        break L3;
                      } else {
                        this.field_m = 0;
                        if (!this.field_p) {
                          L4: {
                            if (this.field_u != null) {
                              this.field_y.b(2);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_u = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_r = 1048576;
                    if (!this.field_q) {
                      this.field_m = 0;
                      if (this.field_p) {
                        break L3;
                      } else {
                        L5: {
                          if (null == this.field_w) {
                            break L5;
                          } else {
                            this.field_l.b(2);
                            break L5;
                          }
                        }
                        this.field_w = null;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (!kta.field_h) {
                  stackIn_35_0 = param2;
                  break L6;
                } else {
                  stackIn_35_0 = param2 << 1744458433;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_35_0;
                if (256 <= this.field_j) {
                  break L7;
                } else {
                  L8: {
                    if (null != this.field_u) {
                      break L8;
                    } else {
                      if (this.field_w == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    this.field_y.b(param0, param1, param2);
                    break L7;
                  } else {
                    if ((var5 ^ -1) == -257) {
                      this.field_l.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_t == null) {
                            break L10;
                          } else {
                            if (this.field_t.length >= var6) {
                              lua.a(this.field_t, 0, var6);
                              lua.a(this.field_o, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_o = new int[var6];
                        this.field_t = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_y.b(this.field_t, 0, param2);
                        this.field_l.b(this.field_o, 0, param2);
                        if (!kta.field_h) {
                          stackIn_49_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_49_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (var4_int * this.field_t[var8] - -(var5 * this.field_o[var8]) >> -1851923352);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
              }
              L13: {
                if (this.field_v == null) {
                  break L13;
                } else {
                  if (-1 != (this.field_j ^ -1)) {
                    L14: {
                      L15: {
                        if (this.field_t == null) {
                          break L15;
                        } else {
                          if (this.field_t.length >= var6) {
                            lua.a(this.field_t, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_t = new int[var6];
                      this.field_o = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_k.b(this.field_t, 0, param2);
                      if (kta.field_h) {
                        localTemp$1 = param1 << 1;
                        param1 = localTemp$1;
                        stackIn_65_0 = localTemp$1;
                        break L16;
                      } else {
                        stackIn_65_0 = param1;
                        break L16;
                      }
                    }
                    var7 = stackIn_65_0;
                    var8 = this.field_j * this.field_s / 256;
                    var9 = -var8 + this.field_s;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = param0[var10 + var7] * var9 + this.field_t[var10] * var8 >> -137305112;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var4);

            stackIn_71_1 = new StringBuilder().append("sq.D(");

            if (param0 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L18;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L18;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(l param0, l param1, int param2) {
        try {
            this.field_l = param0;
            this.field_y = param1;
            this.field_r = param2;
            this.field_n = this.field_y;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sq.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -94) {
                break L1;
              } else {
                var4 = (byte[]) null;
                sq.a(59, (byte[]) null, (byte) -100);
                break L1;
              }
            }
            stackIn_3_0 = aia.a(param1, param0, 71, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("sq.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(byte param0, int param1) {
        int var3 = -104 / ((-2 - param0) / 53);
        this.field_s = param1;
    }

    private final void a(int param0, int param1, int param2, l param3) {
        try {
            this.field_n = param3;
            param3.a((byte) -105, param2, -1);
            if (param0 != 1048576) {
                this.field_o = (int[]) null;
            }
            param3.a(param1, (byte) 55);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final cg c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (0 < this.field_r) {
          if (this.field_u != null) {
            L0: {
              this.field_y.a(param0);
              if (-1048577 >= (this.field_r ^ -1)) {
                break L0;
              } else {
                if (this.field_w == null) {
                  break L0;
                } else {
                  this.field_l.a(param0);
                  break L0;
                }
              }
            }
            L1: {
              if ((this.field_j ^ -1) >= -1) {
                break L1;
              } else {
                if (null != this.field_v) {
                  this.field_k.a(param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (this.field_q) {
              L2: {
                if (this.field_m <= 0) {
                  break L2;
                } else {
                  if (!this.field_y.a((byte) -91)) {
                    this.field_m = -this.field_m;
                    this.field_q = false;
                    this.field_u = null;
                    if (-1 != (this.field_m ^ -1)) {
                      L3: {
                        this.field_r = this.field_r + param0 * this.field_m;
                        if (this.field_r < 1048576) {
                          if ((this.field_r ^ -1) < -1) {
                            break L3;
                          } else {
                            this.field_r = 0;
                            if (this.field_q) {
                              break L3;
                            } else {
                              this.field_m = 0;
                              if (!this.field_p) {
                                L4: {
                                  if (null != this.field_u) {
                                    this.field_y.b(2);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                this.field_u = null;
                                break L3;
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          this.field_r = 1048576;
                          if (this.field_q) {
                            break L3;
                          } else {
                            this.field_m = 0;
                            if (!this.field_p) {
                              L5: {
                                if (this.field_w != null) {
                                  this.field_l.b(2);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              this.field_w = null;
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_m < 0) {
                if (!this.field_l.a((byte) -127)) {
                  this.field_q = false;
                  this.field_m = -this.field_m;
                  this.field_w = null;
                  if (-1 != (this.field_m ^ -1)) {
                    L6: {
                      this.field_r = this.field_r + param0 * this.field_m;
                      if (this.field_r < 1048576) {
                        if ((this.field_r ^ -1) < -1) {
                          break L6;
                        } else {
                          this.field_r = 0;
                          if (this.field_q) {
                            break L6;
                          } else {
                            this.field_m = 0;
                            if (!this.field_p) {
                              L7: {
                                if (null != this.field_u) {
                                  this.field_y.b(2);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              this.field_u = null;
                              break L6;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        this.field_r = 1048576;
                        if (this.field_q) {
                          break L6;
                        } else {
                          this.field_m = 0;
                          if (!this.field_p) {
                            L8: {
                              if (this.field_w != null) {
                                this.field_l.b(2);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            this.field_w = null;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (-1 != (this.field_m ^ -1)) {
                    L9: {
                      this.field_r = this.field_r + param0 * this.field_m;
                      if (this.field_r < 1048576) {
                        if ((this.field_r ^ -1) < -1) {
                          break L9;
                        } else {
                          this.field_r = 0;
                          if (this.field_q) {
                            break L9;
                          } else {
                            this.field_m = 0;
                            if (!this.field_p) {
                              L10: {
                                if (null != this.field_u) {
                                  this.field_y.b(2);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_u = null;
                              break L9;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        this.field_r = 1048576;
                        if (this.field_q) {
                          break L9;
                        } else {
                          this.field_m = 0;
                          if (!this.field_p) {
                            L11: {
                              if (this.field_w != null) {
                                this.field_l.b(2);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            this.field_w = null;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (-1 != (this.field_m ^ -1)) {
                  this.field_r = this.field_r + param0 * this.field_m;
                  if (this.field_r < 1048576) {
                    if ((this.field_r ^ -1) >= -1) {
                      this.field_r = 0;
                      if (!this.field_q) {
                        this.field_m = 0;
                        if (this.field_p) {
                          return;
                        } else {
                          L12: {
                            if (null != this.field_u) {
                              this.field_y.b(2);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          this.field_u = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    this.field_r = 1048576;
                    if (!this.field_q) {
                      this.field_m = 0;
                      if (!this.field_p) {
                        L13: {
                          if (this.field_w != null) {
                            this.field_l.b(2);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        this.field_w = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              if (-1 != (this.field_m ^ -1)) {
                L14: {
                  this.field_r = this.field_r + param0 * this.field_m;
                  if (this.field_r < 1048576) {
                    if ((this.field_r ^ -1) < -1) {
                      break L14;
                    } else {
                      this.field_r = 0;
                      if (this.field_q) {
                        break L14;
                      } else {
                        this.field_m = 0;
                        if (!this.field_p) {
                          L15: {
                            if (null != this.field_u) {
                              this.field_y.b(2);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          this.field_u = null;
                          break L14;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    this.field_r = 1048576;
                    if (this.field_q) {
                      break L14;
                    } else {
                      this.field_m = 0;
                      if (!this.field_p) {
                        L16: {
                          if (this.field_w != null) {
                            this.field_l.b(2);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        this.field_w = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            L17: {
              if (-1048577 >= (this.field_r ^ -1)) {
                break L17;
              } else {
                if (this.field_w == null) {
                  break L17;
                } else {
                  this.field_l.a(param0);
                  break L17;
                }
              }
            }
            L18: {
              if ((this.field_j ^ -1) >= -1) {
                break L18;
              } else {
                if (null != this.field_v) {
                  this.field_k.a(param0);
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L19: {
              if (this.field_q) {
                L20: {
                  if (this.field_m <= 0) {
                    break L20;
                  } else {
                    if (this.field_y.a((byte) -91)) {
                      break L20;
                    } else {
                      L21: {
                        this.field_m = -this.field_m;
                        this.field_q = false;
                        this.field_u = null;
                        if (-1 != (this.field_m ^ -1)) {
                          this.field_r = this.field_r + param0 * this.field_m;
                          if (this.field_r < 1048576) {
                            if ((this.field_r ^ -1) < -1) {
                              break L21;
                            } else {
                              this.field_r = 0;
                              if (this.field_q) {
                                break L21;
                              } else {
                                this.field_m = 0;
                                if (!this.field_p) {
                                  L22: {
                                    if (null != this.field_u) {
                                      this.field_y.b(2);
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  this.field_u = null;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          } else {
                            this.field_r = 1048576;
                            if (this.field_q) {
                              break L21;
                            } else {
                              this.field_m = 0;
                              if (!this.field_p) {
                                L23: {
                                  if (this.field_w != null) {
                                    this.field_l.b(2);
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                this.field_w = null;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                        } else {
                          break L21;
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_m >= 0) {
                  break L19;
                } else {
                  if (this.field_l.a((byte) -127)) {
                    break L19;
                  } else {
                    L24: {
                      this.field_q = false;
                      this.field_m = -this.field_m;
                      this.field_w = null;
                      if (-1 != (this.field_m ^ -1)) {
                        this.field_r = this.field_r + param0 * this.field_m;
                        if (this.field_r < 1048576) {
                          if ((this.field_r ^ -1) < -1) {
                            break L24;
                          } else {
                            this.field_r = 0;
                            if (this.field_q) {
                              break L24;
                            } else {
                              this.field_m = 0;
                              if (!this.field_p) {
                                L25: {
                                  if (null != this.field_u) {
                                    this.field_y.b(2);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                this.field_u = null;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                          }
                        } else {
                          this.field_r = 1048576;
                          if (this.field_q) {
                            break L24;
                          } else {
                            this.field_m = 0;
                            if (!this.field_p) {
                              L26: {
                                if (this.field_w != null) {
                                  this.field_l.b(2);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              this.field_w = null;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                    return;
                  }
                }
              } else {
                break L19;
              }
            }
            if (-1 != (this.field_m ^ -1)) {
              this.field_r = this.field_r + param0 * this.field_m;
              if (this.field_r < 1048576) {
                if ((this.field_r ^ -1) >= -1) {
                  this.field_r = 0;
                  if (!this.field_q) {
                    this.field_m = 0;
                    if (!this.field_p) {
                      L27: {
                        if (null != this.field_u) {
                          this.field_y.b(2);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      this.field_u = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_r = 1048576;
                if (!this.field_q) {
                  this.field_m = 0;
                  if (!this.field_p) {
                    L28: {
                      if (this.field_w != null) {
                        this.field_l.b(2);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    this.field_w = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          L29: {
            if (-1048577 >= (this.field_r ^ -1)) {
              break L29;
            } else {
              if (this.field_w == null) {
                break L29;
              } else {
                this.field_l.a(param0);
                break L29;
              }
            }
          }
          L30: {
            if ((this.field_j ^ -1) >= -1) {
              break L30;
            } else {
              if (null != this.field_v) {
                this.field_k.a(param0);
                break L30;
              } else {
                break L30;
              }
            }
          }
          L31: {
            if (this.field_q) {
              L32: {
                if (this.field_m <= 0) {
                  break L32;
                } else {
                  if (this.field_y.a((byte) -91)) {
                    break L32;
                  } else {
                    L33: {
                      this.field_m = -this.field_m;
                      this.field_q = false;
                      this.field_u = null;
                      if (-1 != (this.field_m ^ -1)) {
                        this.field_r = this.field_r + param0 * this.field_m;
                        if (this.field_r < 1048576) {
                          if ((this.field_r ^ -1) < -1) {
                            break L33;
                          } else {
                            this.field_r = 0;
                            if (this.field_q) {
                              break L33;
                            } else {
                              this.field_m = 0;
                              if (!this.field_p) {
                                L34: {
                                  if (null != this.field_u) {
                                    this.field_y.b(2);
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                this.field_u = null;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                        } else {
                          this.field_r = 1048576;
                          if (this.field_q) {
                            break L33;
                          } else {
                            this.field_m = 0;
                            if (!this.field_p) {
                              L35: {
                                if (this.field_w != null) {
                                  this.field_l.b(2);
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                              this.field_w = null;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                        }
                      } else {
                        break L33;
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_m >= 0) {
                break L31;
              } else {
                if (this.field_l.a((byte) -127)) {
                  break L31;
                } else {
                  L36: {
                    this.field_q = false;
                    this.field_m = -this.field_m;
                    this.field_w = null;
                    if (-1 != (this.field_m ^ -1)) {
                      this.field_r = this.field_r + param0 * this.field_m;
                      if (this.field_r < 1048576) {
                        if ((this.field_r ^ -1) < -1) {
                          break L36;
                        } else {
                          this.field_r = 0;
                          if (this.field_q) {
                            break L36;
                          } else {
                            this.field_m = 0;
                            if (!this.field_p) {
                              L37: {
                                if (null != this.field_u) {
                                  this.field_y.b(2);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                              this.field_u = null;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                        }
                      } else {
                        this.field_r = 1048576;
                        if (this.field_q) {
                          break L36;
                        } else {
                          this.field_m = 0;
                          if (!this.field_p) {
                            L38: {
                              if (this.field_w != null) {
                                this.field_l.b(2);
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                            this.field_w = null;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                      }
                    } else {
                      break L36;
                    }
                  }
                  return;
                }
              }
            } else {
              break L31;
            }
          }
          if (-1 != (this.field_m ^ -1)) {
            this.field_r = this.field_r + param0 * this.field_m;
            if (this.field_r < 1048576) {
              if ((this.field_r ^ -1) >= -1) {
                this.field_r = 0;
                if (!this.field_q) {
                  this.field_m = 0;
                  if (this.field_p) {
                    return;
                  } else {
                    L39: {
                      if (null != this.field_u) {
                        this.field_y.b(2);
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    this.field_u = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_r = 1048576;
              if (!this.field_q) {
                this.field_m = 0;
                if (this.field_p) {
                  return;
                } else {
                  L40: {
                    if (this.field_w != null) {
                      this.field_l.b(2);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  this.field_w = null;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    sq(l param0, l param1) {
        this.field_s = 256;
        this.field_p = false;
        this.field_j = 0;
        try {
            this.a(param1, param0, 1048576);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "Error connecting to server. Please try using a different server.";
    }
}
