/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb extends ca {
    private int field_A;
    private pd field_E;
    int field_C;
    private int field_t;
    private int[] field_i;
    private int field_j;
    int field_F;
    int field_l;
    private int field_B;
    private double field_u;
    private ok[] field_r;
    static int field_m;
    int field_g;
    private int field_n;
    private int field_x;
    private boolean field_z;
    kb field_s;
    private int field_D;
    lb field_p;
    private int field_q;
    private int field_v;
    private int field_o;
    private int field_k;
    private f field_f;
    int field_w;
    int field_h;
    private int field_y;

    final void b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_71_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_70_0 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_g = param2;
              this.field_h = param1;
              var4_int = 10;
              var5 = 2;
              if (-2 != (this.field_C ^ -1)) {
                break L1;
              } else {
                var4_int = 8 + 2 * this.field_F;
                var5 = 2;
                break L1;
              }
            }
            L2: {
              if (this.field_C != 4) {
                break L2;
              } else {
                var4_int = 30;
                var5 = 5;
                break L2;
              }
            }
            L3: {
              if (this.field_C != 2) {
                break L3;
              } else {
                L4: {
                  var4_int = 20;
                  if ((this.field_F ^ -1) == -4) {
                    var4_int = 25;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (4 != this.field_F) {
                    break L5;
                  } else {
                    var4_int = 30;
                    break L5;
                  }
                }
                var5 = 5;
                break L3;
              }
            }
            L6: {
              if (-4 == (this.field_C ^ -1)) {
                var4_int = 6;
                var5 = 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((this.field_C ^ -1) == -6) {
                var5 = 2;
                var4_int = 6;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                L10: {
                  this.field_i = new int[(1 + 2 * var4_int) * (2 * var4_int - -1) - (var5 * 2 + -1) * ((var5 + -1) * 2 - -1)];
                  this.field_l = var4_int;
                  this.field_D = param0;
                  if (this.field_C == 0) {
                    break L10;
                  } else {
                    if (3 == this.field_C) {
                      break L10;
                    } else {
                      L11: {
                        L12: {
                          if (-2 == (this.field_C ^ -1)) {
                            break L12;
                          } else {
                            if (2 == this.field_C) {
                              break L12;
                            } else {
                              if (-6 != (this.field_C ^ -1)) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var6_int = this.field_g;
                        var7 = this.field_h;
                        this.field_g = var6_int;
                        L13: while (true) {
                          stackOut_35_0 = this.field_g;
                          stackIn_36_0 = stackOut_35_0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (stackIn_36_0 >= var6_int + 1) {
                                  break L16;
                                } else {
                                  stackOut_37_0 = this;
                                  stackOut_37_1 = var7;
                                  stackIn_52_0 = stackOut_37_0;
                                  stackIn_52_1 = stackOut_37_1;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  if (var9 != 0) {
                                    break L15;
                                  } else {
                                    ((kb) (this)).field_h = stackIn_38_1;
                                    L17: while (true) {
                                      L18: {
                                        if (this.field_h >= var7 - -1) {
                                          break L18;
                                        } else {
                                          stackOut_41_0 = -var4_int;
                                          stackIn_36_0 = stackOut_41_0;
                                          stackIn_42_0 = stackOut_41_0;
                                          if (var9 != 0) {
                                            continue L14;
                                          } else {
                                            var8 = stackIn_42_0;
                                            L19: while (true) {
                                              L20: {
                                                L21: {
                                                  if (var8 >= var4_int) {
                                                    break L21;
                                                  } else {
                                                    this.field_D = this.a(-7, var5, var4_int, this.field_D, -var4_int + this.field_g, var8 + this.field_h);
                                                    this.field_D = this.a(-7, var5, var4_int, this.field_D, var8 + this.field_g, var4_int + this.field_h);
                                                    this.field_D = this.a(-7, var5, var4_int, this.field_D, var4_int + this.field_g, this.field_h - var8);
                                                    this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g + -var8, this.field_h + -var4_int);
                                                    var8++;
                                                    if (var9 != 0) {
                                                      break L20;
                                                    } else {
                                                      if (var9 == 0) {
                                                        continue L19;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                }
                                                this.field_h = this.field_h + 1;
                                                break L20;
                                              }
                                              if (var9 == 0) {
                                                continue L17;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      this.field_g = this.field_g + 1;
                                      if (var9 == 0) {
                                        continue L13;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_g = var6_int;
                              stackOut_51_0 = this;
                              stackOut_51_1 = var7;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              break L15;
                            }
                            ((kb) (this)).field_h = stackIn_52_1;
                            if (var9 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      if (-5 != (this.field_C ^ -1)) {
                        break L9;
                      } else {
                        this.field_g = this.field_g + 1;
                        var4_int++;
                        this.field_h = this.field_h + 1;
                        var6_int = -var4_int;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (var4_int <= var6_int) {
                                break L24;
                              } else {
                                this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, -var4_int + this.field_g, var6_int + this.field_h);
                                this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, var6_int + this.field_g, this.field_h + var4_int);
                                this.field_D = this.a(-7, var5, var4_int, this.field_D, var4_int + this.field_g, -var6_int + this.field_h);
                                this.field_D = this.a(-7, var5, var4_int, this.field_D, -var6_int + this.field_g, -var4_int + this.field_h);
                                var6_int++;
                                if (var9 != 0) {
                                  break L23;
                                } else {
                                  if (var9 == 0) {
                                    continue L22;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            this.field_h = this.field_h - 1;
                            var4_int--;
                            this.field_g = this.field_g - 1;
                            break L23;
                          }
                          if (var9 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                var6_int = -var4_int;
                L25: while (true) {
                  if (var6_int >= var4_int) {
                    break L9;
                  } else {
                    this.field_D = this.a(param0 ^ -7, var5, var4_int, this.field_D, -var4_int + this.field_g, this.field_h + var6_int);
                    this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - -var6_int, var4_int + this.field_h);
                    this.field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - -var4_int, this.field_h - var6_int);
                    stackOut_66_0 = this;
                    stackIn_71_0 = stackOut_66_0;
                    stackIn_67_0 = stackOut_66_0;
                    if (var9 != 0) {
                      break L8;
                    } else {
                      ((kb) (this)).field_D = this.a(-7, var5, var4_int, this.field_D, this.field_g - var6_int, -var4_int + this.field_h);
                      var6_int++;
                      if (var9 == 0) {
                        continue L25;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              stackOut_70_0 = this;
              stackIn_71_0 = stackOut_70_0;
              break L8;
            }
            var6 = ((kb) (this)).field_i;
            this.field_i = new int[this.field_D];
            var7 = 0;
            L26: while (true) {
              L27: {
                L28: {
                  if (var7 >= this.field_D) {
                    break L28;
                  } else {
                    this.field_i[var7] = var6[var7];
                    var7++;
                    if (var9 != 0) {
                      break L27;
                    } else {
                      if (var9 == 0) {
                        continue L26;
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                this.field_w = this.field_g - -(this.field_f.field_f.field_c * this.field_h);
                break L27;
              }
              L29: {
                L30: {
                  if (5 == this.field_C) {
                    this.field_y = 0;
                    this.field_k = 0;
                    this.field_B = 0;
                    this.field_r = new ok[(1 + this.field_F) * 25 + 1];
                    var7 = 0;
                    L31: while (true) {
                      if ((var7 ^ -1) <= (this.field_r.length ^ -1)) {
                        break L30;
                      } else {
                        this.field_r[var7] = new ok();
                        var7++;
                        if (var9 != 0) {
                          break L29;
                        } else {
                          if (var9 == 0) {
                            continue L31;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                  } else {
                    break L30;
                  }
                }
                break L29;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var4), "kb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 27) {
              if (this.field_k != this.field_B) {
                if ((this.field_k ^ -1) > (this.field_B ^ -1)) {
                  stackOut_9_0 = this.field_B + -this.field_k;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = this.field_B + -this.field_k + this.field_r.length;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -2;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    private final boolean a(int param0, float param1, int param2, int param3, float param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var7 = -102 % ((-37 - param2) / 56);
            var6_int = (this.field_B - -1) % this.field_r.length;
            if ((this.field_k ^ -1) != (var6_int ^ -1)) {
              this.field_r[this.field_B].field_e = param1;
              this.field_r[this.field_B].field_d = param4;
              this.field_r[this.field_B].field_b = param0;
              this.field_r[this.field_B].field_g = param3;
              this.field_r[this.field_B].field_c = this.field_y - -60;
              this.field_B = var6_int;
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var6), "kb.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void a(mg param0, boolean param1) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            int stackIn_8_0 = 0;
            int stackIn_8_1 = 0;
            int stackIn_18_0 = 0;
            int stackIn_18_1 = 0;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            String stackIn_34_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_7_1 = 0;
            int stackOut_17_0 = 0;
            int stackOut_17_1 = 0;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            String stackOut_33_2 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            var5 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  var2 = new byte[24];
                  if (!param1) {
                    break L1;
                  } else {
                    field_m = -86;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (null == s.field_y) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          s.field_y.a(0L, -1);
                          s.field_y.a(var2, 4);
                          var3_int = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var3_int >= 24) {
                                  break L7;
                                } else {
                                  stackOut_7_0 = -1;
                                  stackOut_7_1 = var2[var3_int] ^ -1;
                                  stackIn_18_0 = stackOut_7_0;
                                  stackIn_18_1 = stackOut_7_1;
                                  stackIn_8_0 = stackOut_7_0;
                                  stackIn_8_1 = stackOut_7_1;
                                  if (var5 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      if (stackIn_8_0 == stackIn_8_1) {
                                        break L8;
                                      } else {
                                        if (var5 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var5 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              stackOut_17_0 = -25;
                              stackOut_17_1 = var3_int ^ -1;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              break L6;
                            }
                            if (stackIn_18_0 < stackIn_18_1) {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          exception = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L10: while (true) {
                            L11: {
                              if (-25 >= (var4 ^ -1)) {
                                break L11;
                              } else {
                                var2[var4] = (byte) -1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L9;
                                } else {
                                  if (var5 == 0) {
                                    continue L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L9;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0.a(0, 24, (byte) -11, var2);
                  break L2;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_30_0 = (RuntimeException) (runtimeException);
                stackOut_30_1 = new StringBuilder().append("kb.D(");
                stackIn_33_0 = stackOut_30_0;
                stackIn_33_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (param0 == null) {
                  stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
                  stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
                  stackOut_33_2 = "null";
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  break L12;
                } else {
                  stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
                  stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
                  stackOut_31_2 = "{...}";
                  stackIn_34_0 = stackOut_31_0;
                  stackIn_34_1 = stackOut_31_1;
                  stackIn_34_2 = stackOut_31_2;
                  break L12;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                ld.field_e = param2;
                try {
                  L1: {
                    var3 = param0.getParameter("cookieprefix");
                    var4 = param0.getParameter("cookiehost");
                    if (!param1) {
                      L2: {
                        L3: {
                          var5 = var3 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                          if ((param2.length() ^ -1) == -1) {
                            break L3;
                          } else {
                            var5 = var5 + "; Expires=" + dh.a(-15591, ji.b(-78) + 94608000000L) + "; Max-Age=" + 94608000L;
                            if (!OrbDefence.field_D) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                      gm.a((byte) -17, "document.cookie=\"" + var5 + "\"", param0);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  g.a(1, param0);
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (var3_ref2);
                stackOut_11_1 = new StringBuilder().append("kb.B(");
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_19_1 = stackOut_16_1;
                  stackIn_19_2 = stackOut_16_2;
                  break L6;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, pd param1, int param2) {
        hf discarded$2 = null;
        hf discarded$3 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb var9 = null;
        int var10 = 0;
        int stackIn_89_0 = 0;
        int stackIn_94_0 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_88_0 = 0;
        int stackOut_93_0 = 0;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (-1 <= (-param1.field_h + param1.field_o ^ -1)) {
              this.field_f.field_h.a(-74, new me((double)param1.field_u, (double)param1.field_z, 1));
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == this.field_p) {
                  break L1;
                } else {
                  nh.field_b = nh.field_b + param0;
                  this.field_p.field_d = this.field_p.field_d + param0;
                  break L1;
                }
              }
              L2: {
                param1.field_h = param1.field_h + param0;
                var4_int = 79 % ((param2 - -47) / 56);
                if (null == param1.field_p) {
                  var5 = this.field_g - param1.field_u;
                  var6 = -param1.field_z + this.field_h;
                  if ((var6 * var6 + var5 * var5 ^ -1) > -101) {
                    param1.field_B = 0;
                    param1.field_p = (kb) (this);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  if (-param1.field_h + param1.field_o > 0) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (!param1.field_n) {
                          break L6;
                        } else {
                          discarded$2 = ea.a(53, mh.field_a[54], (int)(96.0 * param1.field_v));
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      discarded$3 = ea.a(11, mh.field_a[(int)(Math.random() * 5.0) + 49], (int)(96.0 * param1.field_v));
                      break L5;
                    }
                    L7: {
                      param1.field_h = param1.field_h - param1.field_o;
                      param1.field_o = 0;
                      if ((this.field_F ^ -1) == -5) {
                        L8: {
                          if (-1 == (this.field_C ^ -1)) {
                            this.field_f.field_t = this.field_f.field_t + 1;
                            if (this.field_f.field_t != 99) {
                              break L8;
                            } else {
                              f.a(9, 246, (byte) -25);
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_C == 1) {
                            this.field_f.field_l = this.field_f.field_l + 1;
                            if (this.field_f.field_l != 99) {
                              break L9;
                            } else {
                              f.a(10, 245, (byte) -25);
                              break L9;
                            }
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if ((this.field_C ^ -1) == -3) {
                            this.field_f.field_u = this.field_f.field_u + 1;
                            if ((this.field_f.field_u ^ -1) == -100) {
                              f.a(11, 244, (byte) -25);
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        if ((this.field_C ^ -1) == -5) {
                          this.field_f.field_p = this.field_f.field_p + 1;
                          if ((this.field_f.field_p ^ -1) != -100) {
                            break L7;
                          } else {
                            f.a(12, 243, (byte) -25);
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L11: {
                      L12: {
                        if (null == this.field_p) {
                          break L12;
                        } else {
                          L13: {
                            this.field_p.field_d = this.field_p.field_d + he.field_p[param1.field_y];
                            nh.field_b = nh.field_b + he.field_p[param1.field_y];
                            var5 = he.field_p[param1.field_y];
                            if (!param1.field_n) {
                              break L13;
                            } else {
                              var5 = var5 + he.field_p[param1.field_y] * 99;
                              break L13;
                            }
                          }
                          var6 = 0;
                          L14: while (true) {
                            if ((var6 ^ -1) <= (var5 ^ -1)) {
                              break L12;
                            } else {
                              this.field_f.field_b.a(-91, new oj(param1.field_u, param1.field_z, this.field_p, var6));
                              var6++;
                              if (var10 != 0) {
                                break L11;
                              } else {
                                if (var10 == 0) {
                                  continue L14;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                      }
                      this.field_f.field_h.a(-99, new me((double)param1.field_u, (double)param1.field_z, 1));
                      break L11;
                    }
                    L15: {
                      L16: {
                        L17: {
                          if (-12 > (this.field_f.field_x ^ -1)) {
                            break L17;
                          } else {
                            if ((this.field_f.field_m ^ -1) > -5) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        this.field_f.field_f.field_g[param1.field_u + this.field_f.field_f.field_c * param1.field_z] = this.field_f.field_f.field_g[param1.field_u + this.field_f.field_f.field_c * param1.field_z] + 5;
                        var5 = 0;
                        L18: while (true) {
                          if ((this.field_D ^ -1) >= (var5 ^ -1)) {
                            break L16;
                          } else {
                            this.field_f.field_f.field_v[this.field_i[var5]] = this.field_f.field_f.field_v[this.field_i[var5]] + 1;
                            var5++;
                            if (var10 != 0) {
                              break L15;
                            } else {
                              if (var10 == 0) {
                                continue L18;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (-6 == (param1.field_y ^ -1)) {
                          break L19;
                        } else {
                          if (param1.field_n) {
                            break L19;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = 3;
                      break L15;
                    }
                    L20: {
                      if (param1.field_n) {
                        var5 = 5;
                        if (5 == param1.field_y) {
                          var5 = 10;
                          break L20;
                        } else {
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    var6 = param1.field_u - var5;
                    L21: while (true) {
                      stackOut_88_0 = param1.field_u + var5;
                      stackIn_89_0 = stackOut_88_0;
                      L22: while (true) {
                        if (stackIn_89_0 < var6) {
                          break L4;
                        } else {
                          if (var10 != 0) {
                            break L3;
                          } else {
                            var7 = param1.field_z + -var5;
                            L23: while (true) {
                              L24: {
                                if ((var7 ^ -1) < (var5 + param1.field_z ^ -1)) {
                                  break L24;
                                } else {
                                  stackOut_93_0 = var6;
                                  stackIn_89_0 = stackOut_93_0;
                                  stackIn_94_0 = stackOut_93_0;
                                  if (var10 != 0) {
                                    continue L22;
                                  } else {
                                    L25: {
                                      if (stackIn_94_0 < 0) {
                                        break L25;
                                      } else {
                                        if ((this.field_f.field_f.field_c ^ -1) >= (var6 ^ -1)) {
                                          break L25;
                                        } else {
                                          if (0 > var7) {
                                            break L25;
                                          } else {
                                            if ((this.field_f.field_f.field_t ^ -1) < (var7 ^ -1)) {
                                              this.field_f.field_h.a(-107, new me((double)param1.field_u, (double)param1.field_z, 0.05 * (double)(var6 + -param1.field_u), 0.05 * (double)(-param1.field_z + var7), 1));
                                              var8 = this.field_f.field_f.field_c * var7 + var6;
                                              if (-8 != (this.field_f.field_f.field_o[var8] ^ -1)) {
                                                break L25;
                                              } else {
                                                var9 = this.field_f.a(var8, -66);
                                                var9.d(9);
                                                break L25;
                                              }
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var7++;
                                    if (var10 == 0) {
                                      continue L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                              var6++;
                              if (var10 == 0) {
                                continue L21;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var4 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) (var4);
            stackOut_111_1 = new StringBuilder().append("kb.E(").append(param0).append(',');
            stackIn_114_0 = stackOut_111_0;
            stackIn_114_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param1 == null) {
              stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L26;
            } else {
              stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
              stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
              stackOut_112_2 = "{...}";
              stackIn_115_0 = stackOut_112_0;
              stackIn_115_1 = stackOut_112_1;
              stackIn_115_2 = stackOut_112_2;
              break L26;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -36) {
                break L1;
              } else {
                this.d(-12);
                break L1;
              }
            }
            var4_int = -param0 - -320;
            var5 = -param2 - -240;
            var6 = this.field_k;
            L2: while (true) {
              L3: {
                L4: {
                  if (this.field_B == var6) {
                    break L4;
                  } else {
                    var7 = var4_int + (int)((float)ol.field_e * this.field_r[var6].field_e);
                    var8 = (int)(this.field_r[var6].field_d * (float)ol.field_e) + var5;
                    var9 = var4_int + this.field_r[var6].field_b * ol.field_e;
                    var10 = var5 + ol.field_e * this.field_r[var6].field_g;
                    var11 = (-this.field_y + this.field_r[var6].field_c) * 4;
                    ul.f(var7 - 1, var8, -1 + var9, var10, 11176191, var11);
                    ul.f(var7 + 1, var8, 1 + var9, var10, 11176191, var11);
                    ul.f(var7, -1 + var8, var9, -1 + var10, 11176191, var11);
                    ul.f(var7, 1 + var8, var9, 1 + var10, 11176191, var11);
                    ul.f(var7, var8, var9, var10, 16777215, var11);
                    var6 = (1 + var6) % this.field_r.length;
                    if (var12 != 0) {
                      break L3;
                    } else {
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var4), "kb.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        pd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == 12) {
              this.field_y = this.field_y + 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (this.field_B == this.field_k) {
                      break L3;
                    } else {
                      stackOut_5_0 = this.field_y ^ -1;
                      stackOut_5_1 = this.field_r[this.field_k].field_c ^ -1;
                      stackIn_13_0 = stackOut_5_0;
                      stackIn_13_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 >= stackIn_6_1) {
                          break L3;
                        } else {
                          this.field_k = (this.field_k - -1) % this.field_r.length;
                          if (var8 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = this.field_k ^ -1;
                  stackOut_12_1 = this.field_B ^ -1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == stackIn_13_1) {
                    break L4;
                  } else {
                    var2_int = this.field_y + 59;
                    var3 = this.field_B;
                    L5: while (true) {
                      L6: {
                        var3--;
                        if (0 <= var3) {
                          break L6;
                        } else {
                          var3 = -1 + this.field_r.length;
                          break L6;
                        }
                      }
                      if ((this.field_r[var3].field_c ^ -1) != (var2_int ^ -1)) {
                        break L4;
                      } else {
                        var4 = (pd) ((Object) this.field_f.field_r.b((byte) 117));
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (null == var4) {
                                break L9;
                              } else {
                                stackOut_20_0 = -1;
                                stackOut_20_1 = var4.field_f ^ -1;
                                stackIn_58_0 = stackOut_20_0;
                                stackIn_58_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (var8 != 0) {
                                  break L8;
                                } else {
                                  L10: {
                                    if (stackIn_21_0 != stackIn_21_1) {
                                      break L10;
                                    } else {
                                      if (var4.field_m > 0) {
                                        break L10;
                                      } else {
                                        var5 = this.field_r[var3].field_b + -var4.field_u;
                                        var6 = this.field_r[var3].field_g + -var4.field_z;
                                        if (Math.abs(var5) >= 4) {
                                          break L10;
                                        } else {
                                          if (-5 < (Math.abs(var6) ^ -1)) {
                                            if (!this.a(var4.field_u, (float)this.field_r[var3].field_b, 71, var4.field_z, (float)this.field_r[var3].field_g)) {
                                              break L10;
                                            } else {
                                              L11: {
                                                var4.field_f = 60;
                                                if ((var4.field_y ^ -1) == -8) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    L13: {
                                                      var7 = 5;
                                                      if (this.field_F != 1) {
                                                        break L13;
                                                      } else {
                                                        var7 = 10;
                                                        if (var8 == 0) {
                                                          break L12;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    L14: {
                                                      if ((this.field_F ^ -1) != -3) {
                                                        break L14;
                                                      } else {
                                                        var7 = 20;
                                                        if (var8 == 0) {
                                                          break L12;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                    L15: {
                                                      if (3 != this.field_F) {
                                                        break L15;
                                                      } else {
                                                        var7 = 40;
                                                        if (var8 == 0) {
                                                          break L12;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    if (this.field_F == 4) {
                                                      var7 = 80;
                                                      break L12;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                  this.a(var7, var4, 44);
                                                  if (var8 == 0) {
                                                    break L10;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              var4.field_f = 120;
                                              break L10;
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4 = (pd) ((Object) this.field_f.field_r.d(param0 ^ 857));
                                  if (var8 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            stackOut_57_0 = this.field_k ^ -1;
                            stackOut_57_1 = var3 ^ -1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            break L8;
                          }
                          if (stackIn_58_0 != stackIn_58_1) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        double var3_double = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -this.field_o + this.field_q;
              if (32768 < var2_int) {
                var2_int = var2_int - 65536;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-32768 <= var2_int) {
                break L2;
              } else {
                var2_int = var2_int + 65536;
                break L2;
              }
            }
            L3: {
              L4: {
                if (this.field_C != 5) {
                  break L4;
                } else {
                  this.field_o = this.field_o + (-(5 * this.field_t) + 2500);
                  if (var7 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_o = this.field_o + var2_int / 10;
              break L3;
            }
            L5: {
              if ((this.field_o ^ -1) >= -32769) {
                break L5;
              } else {
                this.field_o = this.field_o - 65536;
                break L5;
              }
            }
            L6: {
              if (-32768 <= this.field_o) {
                break L6;
              } else {
                this.field_o = this.field_o + 65536;
                break L6;
              }
            }
            L7: {
              L8: {
                if (this.field_C == 1) {
                  break L8;
                } else {
                  if (2 == this.field_C) {
                    break L8;
                  } else {
                    if (this.field_C != 4) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              this.field_o = this.field_q;
              break L7;
            }
            if (param0 > 120) {
              L9: {
                if (!this.field_z) {
                  break L9;
                } else {
                  L10: {
                    if (-1 == (this.field_C ^ -1)) {
                      this.field_A = this.field_E.field_z;
                      this.field_x = this.field_E.field_u;
                      if ((this.field_t ^ -1) >= -6) {
                        break L10;
                      } else {
                        if ((this.field_t ^ -1) <= -26) {
                          break L10;
                        } else {
                          L11: {
                            var3 = Math.abs(-this.field_x + this.field_g) - -Math.abs(-this.field_A + this.field_h);
                            if ((var3 ^ -1) >= -21) {
                              break L11;
                            } else {
                              var3 = 20;
                              break L11;
                            }
                          }
                          L12: {
                            if ((var3 ^ -1) > -2) {
                              var3 = 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          if (this.field_t >= 5 + var3) {
                            break L10;
                          } else {
                            this.field_f.field_h.a(-114, new me((double)this.field_x + (-5.0 + (double)this.field_t) * (double)(this.field_g - this.field_x) / (double)var3, (double)(-this.field_A + this.field_h) * ((double)this.field_t - 5.0) / (double)var3 + (double)this.field_A, 6));
                            break L10;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  L13: {
                    if (-4 == (this.field_C ^ -1)) {
                      if (this.field_t <= -45 + this.field_n) {
                        break L13;
                      } else {
                        if ((this.field_n ^ -1) < (this.field_t ^ -1)) {
                          L14: {
                            var3 = Math.abs(this.field_g - this.field_x) - -Math.abs(-this.field_A + this.field_h);
                            if (var3 > 40) {
                              var3 = 40;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (-2 >= (var3 ^ -1)) {
                              break L15;
                            } else {
                              var3 = 1;
                              break L15;
                            }
                          }
                          if (-45 + (this.field_n - -var3) > this.field_t) {
                            this.field_f.field_h.a(-90, new me((double)this.field_x + (double)(-this.field_x + this.field_g) * ((double)this.field_t - ((double)this.field_n - 45.0)) / (double)var3, (double)this.field_A + (double)(-this.field_A + this.field_h) * (45.0 - (double)this.field_n + (double)this.field_t) / (double)var3, 8));
                            break L13;
                          } else {
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                  if (2 != this.field_C) {
                    break L9;
                  } else {
                    L16: {
                      if (this.field_t != 50) {
                        break L16;
                      } else {
                        var3_double = 0.0;
                        L17: while (true) {
                          if (6.283185307179586 <= var3_double) {
                            break L16;
                          } else {
                            this.field_f.field_h.a(-82, new me((double)this.field_x + Math.random() - 0.5, (double)this.field_A + Math.random() - 0.5, 0.05 * Math.sin(var3_double), Math.cos(var3_double) * 0.05, 1));
                            var3_double = var3_double + 0.8;
                            if (var7 != 0) {
                              break L9;
                            } else {
                              if (var7 == 0) {
                                continue L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (this.field_t <= 50) {
                      break L9;
                    } else {
                      if (this.field_t < 100) {
                        L18: {
                          var3 = (Math.abs(-this.field_x + this.field_g) - -Math.abs(-this.field_A + this.field_h)) * 5;
                          if (-51 > (var3 ^ -1)) {
                            var3 = 50;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (-2 < (var3 ^ -1)) {
                            var3 = 1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        if ((this.field_t ^ -1) <= (var3 + 50 ^ -1)) {
                          break L9;
                        } else {
                          var4 = var3 / 2;
                          var5 = this.field_t - (var4 + 50);
                          var6 = (int)(0.5 * Math.sqrt((double)(-(var5 * var5) + var4 * var4)));
                          this.field_f.field_h.a(-119, new me((double)this.field_x + (double)(-this.field_x + this.field_g) * ((double)this.field_t - 50.0) / (double)var3, (double)(-var6) + ((double)(-this.field_A + this.field_h) * ((double)this.field_t - 50.0) / (double)var3 + (double)this.field_A), 4));
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hj var7_ref_hj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (-1 == this.field_C) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == -8) {
                  break L1;
                } else {
                  this.b((byte) -4);
                  break L1;
                }
              }
              L2: {
                var4_int = 320 + -param0 + this.field_g * ol.field_e;
                var5 = 240 + (-param1 + this.field_h * ol.field_e);
                this.field_u = 320.0 / (double)(320 + Math.abs(-320 + var4_int));
                if (!this.field_z) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var6 = 320 + (ol.field_e * this.field_x + -param0);
                      var7 = 240 + -param1 + ol.field_e * this.field_A;
                      var10 = this.field_C;
                      if (-2 != (var10 ^ -1)) {
                        break L4;
                      } else {
                        if (var15 == 0) {
                          if ((this.field_t ^ -1) < (this.field_n - 20 ^ -1)) {
                            var10 = ol.field_e / 2 + var4_int;
                            var11 = -8 + (var5 + ol.field_e / 2);
                            ul.f(var6 + -1, var7, -1 + var10, var11, 11176191, -(10 * (this.field_n - this.field_t)) + 200);
                            ul.f(var6 - -1, var7, 1 + var10, var11, 11176191, -(10 * (-this.field_t + this.field_n)) + 200);
                            ul.f(var6, -1 + var7, var10, var11 + -1, 11176191, 200 + -((-this.field_t + this.field_n) * 10));
                            ul.f(var6, 1 + var7, var10, 1 + var11, 11176191, 200 + -(10 * (-this.field_t + this.field_n)));
                            ul.f(var6, var7, var10, var11, 16777215, 200 - 10 * (this.field_n + -this.field_t));
                            if (var15 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            break L2;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var10 == 4) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var9 = -12 + (ol.field_e + var5);
                    var8 = var4_int - -ol.field_e;
                    if (5 < this.field_t) {
                      break L5;
                    } else {
                      if (this.field_E == null) {
                        break L5;
                      } else {
                        if (-1 <= (-this.field_E.field_h + this.field_E.field_o ^ -1)) {
                          break L5;
                        } else {
                          ul.f(var6 + -1, var7, var8 - 1, var9, 16776960, 200 - (-this.field_t + this.field_n) * 10);
                          ul.f(1 + var6, var7, var8 + 1, var9, 16776960, -((-this.field_t + this.field_n) * 10) + 200);
                          ul.f(var6, -1 + var7, var8, -1 + var9, 16776960, 200 - (this.field_n - this.field_t) * 10);
                          ul.f(var6, var7 - -1, var8, 1 + var9, 16776960, 200 + -((this.field_n - this.field_t) * 10));
                          ul.f(var6, var7, var8, var9, 16777215, 200 - (-this.field_t + this.field_n) * 10);
                          if (var15 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (50 < this.field_t) {
                    break L2;
                  } else {
                    if (this.field_E == null) {
                      break L2;
                    } else {
                      if (this.field_E.field_o - this.field_E.field_h > 0) {
                        this.field_x = this.field_E.field_u;
                        this.field_A = this.field_E.field_z;
                        ul.f(-1 + var6, var7, -1 + var8, var9, 16776960, 250 + -(5 * this.field_t));
                        ul.f(var6 + 1, var7, 1 + var8, var9, 16776960, 250 + -(this.field_t * 5));
                        ul.f(var6, var7 - 1, var8, var9 - 1, 16776960, 5 * (-this.field_t + 50));
                        ul.f(var6, 1 + var7, var8, var9 - -1, 16776960, (-this.field_t + 50) * 5);
                        ul.f(var6, var7, var8, var9, 16777215, 5 * (50 - this.field_t));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L6: {
                L7: {
                  if ((this.field_C ^ -1) == -1) {
                    break L7;
                  } else {
                    L8: {
                      if ((this.field_C ^ -1) != -2) {
                        break L8;
                      } else {
                        L9: {
                          var5 = var5 + ol.field_e / 2;
                          var4_int = var4_int + ol.field_e / 2;
                          hf.field_g[this.field_C * 7 + 0].a(var4_int, -5 + var5, 0, 1950);
                          var6 = 32;
                          if (-1 != (this.field_F ^ -1)) {
                            break L9;
                          } else {
                            var6 = 24;
                            break L9;
                          }
                        }
                        L10: {
                          if (this.field_F != 1) {
                            break L10;
                          } else {
                            var6 = 24;
                            break L10;
                          }
                        }
                        L11: {
                          if (-3 == (this.field_F ^ -1)) {
                            var6 = 24;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (3 == this.field_F) {
                            var6 = 24;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (this.field_F == 4) {
                            var6 = 24;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        hf.field_g[this.field_C * 7 + this.field_F + 2].a(528, var6 << 1938238244, var4_int << 653233604, var5 + -8 << 38535684, 32768 + this.field_o, 1950);
                        hf.field_g[1 - -(7 * this.field_C)].a(var4_int, var5 - 5, 0, 1950);
                        if (var15 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L14: {
                      if (2 != this.field_C) {
                        break L14;
                      } else {
                        L15: {
                          var4_int = var4_int + ol.field_e / 2;
                          var5 = var5 + ol.field_e / 2;
                          hf.field_g[0 - -(7 * this.field_C)].a(var4_int, var5 - 5, 0, 1950);
                          var6 = 32;
                          if (-1 != (this.field_F ^ -1)) {
                            break L15;
                          } else {
                            var6 = 24;
                            break L15;
                          }
                        }
                        L16: {
                          if ((this.field_F ^ -1) != -2) {
                            break L16;
                          } else {
                            var6 = 24;
                            break L16;
                          }
                        }
                        L17: {
                          if (-3 == (this.field_F ^ -1)) {
                            var6 = 24;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if ((this.field_F ^ -1) == -4) {
                            var6 = 24;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (this.field_F != 4) {
                            break L19;
                          } else {
                            var6 = 24;
                            break L19;
                          }
                        }
                        hf.field_g[this.field_F + (2 - -(7 * this.field_C))].a(528, var6 << 303462692, var4_int << -1161801244, var5 - 12 << -2131739932, this.field_o - -32768, 1950);
                        hf.field_g[7 * this.field_C + 1].a(var4_int, -8 + var5, 0, 1950);
                        if (var15 == 0) {
                          break L6;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L20: {
                      if (this.field_C == 5) {
                        break L20;
                      } else {
                        L21: {
                          if (this.field_C != 6) {
                            break L21;
                          } else {
                            hf.field_g[7 * this.field_C + 0].a(var4_int, var5 - 5, 0, 1300);
                            if (this.field_s == null) {
                              break L6;
                            } else {
                              if ((this.field_s.field_C ^ -1) != 0) {
                                L22: {
                                  var6 = var4_int;
                                  var7 = -10 + var5;
                                  var8 = 320 + this.field_s.field_g * ol.field_e - param0;
                                  var9 = -10 + (-param1 + (this.field_s.field_h * ol.field_e - -240));
                                  var10 = 200 * this.field_j / 100;
                                  if ((this.field_s.field_t ^ -1) >= 9) {
                                    break L22;
                                  } else {
                                    L23: {
                                      var10 = 20 * -this.field_s.field_t;
                                      var11 = var6 + -var8;
                                      var12 = var7 - var9;
                                      if (var11 != 0) {
                                        break L23;
                                      } else {
                                        if ((var12 ^ -1) == -1) {
                                          break L22;
                                        } else {
                                          var7 = var9 + var12 * -this.field_s.field_t / 10;
                                          if (var15 == 0) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                    var6 = var8 - -(-this.field_s.field_t * var11 / 10);
                                    break L22;
                                  }
                                }
                                var11 = 11176191;
                                ul.f(var6 - 1, var7, -1 + var8, var9, var11, var10);
                                var12 = 16777215;
                                ul.f(var6 + 1, var7, var8 - -1, var9, var11, var10);
                                ul.f(var6, -1 + var7, var8, -1 + var9, var11, var10);
                                ul.f(var6, var7 - -1, var8, var9 + 1, var11, var10);
                                ul.f(var6, var7, var8, var9, var12, var10);
                                if (var15 == 0) {
                                  break L6;
                                } else {
                                  break L21;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L24: {
                          if (-4 != (this.field_C ^ -1)) {
                            break L24;
                          } else {
                            L25: {
                              hf.field_g[7 * this.field_C + 0].a(var4_int, -5 + var5, 0, 1300);
                              var6 = 32;
                              if (0 == this.field_F) {
                                var6 = 24;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (this.field_F == 1) {
                                var6 = 24;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            L27: {
                              if (this.field_F == 2) {
                                var6 = 24;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L28: {
                              if (-4 == (this.field_F ^ -1)) {
                                var6 = 24;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            L29: {
                              if (this.field_F == 4) {
                                var6 = 24;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            hf.field_g[7 * this.field_C + (this.field_F + 2)].a(528, var6 << 933634884, var4_int << 1560917188, -12 + var5 << 202859460, this.field_o - -32768, 1800);
                            hf.field_g[1 - -(7 * this.field_C)].a(var4_int, var5 - 10, 0, 1300);
                            if (var15 == 0) {
                              break L6;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (4 != this.field_C) {
                          break L6;
                        } else {
                          L30: {
                            var4_int = var4_int + ol.field_e;
                            var5 = var5 + ol.field_e;
                            hf.field_g[0 - -(this.field_C * 7)].a(var4_int, var5 + -5, 0, 2600);
                            var6 = 32;
                            if (-1 != (this.field_F ^ -1)) {
                              break L30;
                            } else {
                              var6 = 16;
                              break L30;
                            }
                          }
                          L31: {
                            if (1 == this.field_F) {
                              var6 = 16;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (-3 == (this.field_F ^ -1)) {
                              var6 = 16;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if ((this.field_F ^ -1) != -4) {
                              break L33;
                            } else {
                              var6 = 16;
                              break L33;
                            }
                          }
                          L34: {
                            if (4 != this.field_F) {
                              break L34;
                            } else {
                              var6 = 16;
                              break L34;
                            }
                          }
                          hf.field_g[7 * this.field_C + (this.field_F + 2)].a(528, var6 << -197719484, var4_int << 725426724, var5 - 12 << -1597101948, 32768 + this.field_o, 2600);
                          hf.field_g[this.field_C * 7 + 1].a(var4_int, var5 + -8, 0, 2600);
                          if (var15 == 0) {
                            break L6;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    L35: {
                      var4_int = var4_int + ol.field_e / 2;
                      var5 = var5 + ol.field_e / 2;
                      var6 = 1950;
                      hf.field_g[7 * this.field_C + 0].a(var4_int, -5 + var5, 0, var6);
                      var7_ref_hj = hf.field_g[2 - -this.field_F + this.field_C * 7];
                      var7_ref_hj.a(var7_ref_hj.field_s << 95796387, var7_ref_hj.field_t << 1016741347, var4_int << -1917870652, -12 + var5 << -1819484508, 32768 + this.field_o, var6);
                      hf.field_g[this.field_C * 7 + 1].a(var4_int, var5 - 8, 0, var6);
                      if (this.field_t <= 5) {
                        var8 = this.field_f.field_i % 9000;
                        var9 = var6 * hf.field_g[7 * this.field_C].field_o >> -738604692;
                        var10 = hf.field_g[this.field_C * 7].field_k * var6 >> 1487675052;
                        var11 = (this.field_g * this.field_g + var8) % var9 + var4_int + -(var9 >> -1718563167);
                        var12 = (this.field_h * this.field_g + var8) % var10 - -var5 - (var10 >> 601988865);
                        var13 = -(var9 >> 1463485537) - (-var4_int - (var8 * var8 + this.field_g) % var9);
                        var14 = var8 * var8 % var10 - -var5 + -(var10 >> 217328737);
                        ul.f(var11, var12, var13, var14, 16777215, 200);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    if (var15 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L36: {
                  hf.field_g[0 - -(this.field_C * 7)].a(var4_int, var5 - 5, 0, 1300);
                  var6 = 32;
                  if (this.field_F == 0) {
                    var6 = 32;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (-2 == (this.field_F ^ -1)) {
                    var6 = 32;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (-3 != (this.field_F ^ -1)) {
                    break L38;
                  } else {
                    var6 = 24;
                    break L38;
                  }
                }
                L39: {
                  if ((this.field_F ^ -1) != -4) {
                    break L39;
                  } else {
                    var6 = 24;
                    break L39;
                  }
                }
                L40: {
                  if ((this.field_F ^ -1) == -5) {
                    var6 = 24;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                hf.field_g[7 * this.field_C + (2 - -this.field_F)].a(528, var6 << 1383137316, var4_int << -1592905724, var5 + -8 << 230949348, 32768 + this.field_o, 1300);
                hf.field_g[1 + 7 * this.field_C].a(var4_int, -6 + var5, 0, 1300);
                break L6;
              }
              L41: {
                if (null == this.field_p) {
                  break L41;
                } else {
                  L42: {
                    var6 = 0;
                    if (this.field_p.field_i != 0) {
                      break L42;
                    } else {
                      var6 = 16711680;
                      break L42;
                    }
                  }
                  L43: {
                    if ((this.field_p.field_i ^ -1) != -2) {
                      break L43;
                    } else {
                      var6 = 65280;
                      break L43;
                    }
                  }
                  L44: {
                    if (this.field_p.field_i != 2) {
                      break L44;
                    } else {
                      var6 = 255;
                      break L44;
                    }
                  }
                  L45: {
                    if (3 != this.field_p.field_i) {
                      break L45;
                    } else {
                      var6 = 16776960;
                      break L45;
                    }
                  }
                  L46: {
                    var5 -= 15;
                    if (-1 <= (this.field_F ^ -1)) {
                      break L46;
                    } else {
                      L47: {
                        var6 = 16777215;
                        if (1 == this.field_F) {
                          var6 = 255;
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      L48: {
                        if ((this.field_F ^ -1) != -3) {
                          break L48;
                        } else {
                          var6 = 8913151;
                          break L48;
                        }
                      }
                      L49: {
                        if (-4 == (this.field_F ^ -1)) {
                          var6 = 16746751;
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if ((this.field_F ^ -1) == -5) {
                          var6 = 16777215;
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                      L51: {
                        var7 = 4;
                        ul.i(var4_int, var5, var7, var6, 128);
                        if (-3 <= (ol.field_e >> -1681279358 ^ -1)) {
                          break L51;
                        } else {
                          ul.i(var4_int, var5, -1 + var7, var6, 128);
                          break L51;
                        }
                      }
                      L52: {
                        if (-4 <= (ol.field_e >> 1281681026 ^ -1)) {
                          break L52;
                        } else {
                          ul.i(var4_int, var5, -2 + var7, var6, 128);
                          break L52;
                        }
                      }
                      ul.g(var4_int, var5, var7, 0);
                      break L46;
                    }
                  }
                  L53: {
                    if (-5 >= (this.field_F ^ -1)) {
                      break L53;
                    } else {
                      if (ui.field_a[this.field_C][this.field_F - -1] > this.field_f.field_e[0].b(true)) {
                        break L53;
                      } else {
                        if (this.field_F >= jk.field_j[this.field_C]) {
                          break L53;
                        } else {
                          var7 = 64 + (int)(Math.sin((double)ji.b(param2 ^ 91) * 0.01 + (double)this.field_g + (double)this.field_h) * 48.0);
                          var6 = 16777215;
                          ul.a(var4_int << 1217976036, var5 << 1762441316, var7, 255, ki.field_f);
                          break L53;
                        }
                      }
                    }
                  }
                  var5 += 15;
                  break L41;
                }
              }
              L54: {
                if (this.field_v >= 50) {
                  break L54;
                } else {
                  if (-3 <= (this.field_t ^ -1)) {
                    L55: {
                      L56: {
                        var6 = 16776960;
                        if ((this.field_h & 1) > 0) {
                          break L56;
                        } else {
                          var4_int++;
                          if (var15 == 0) {
                            break L55;
                          } else {
                            break L56;
                          }
                        }
                      }
                      var4_int--;
                      break L55;
                    }
                    L57: {
                      if ((this.field_v ^ -1) >= -1) {
                        var6 = 16711680;
                        break L57;
                      } else {
                        break L57;
                      }
                    }
                    ul.h(-1 + var4_int, -5 + var5, 4, 11, 0);
                    ul.h(var4_int, var5 + -4, 2, 4, var6);
                    ul.h(var4_int, var5 - -3, 2, 2, var6);
                    break L54;
                  } else {
                    break L54;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var4), "kb.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        hf discarded$3 = null;
        hf discarded$4 = null;
        boolean discarded$5 = false;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        pd var3_ref_pd = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5 = 0;
        pd var5_ref_pd = null;
        int var6 = 0;
        km var6_ref_km = null;
        int var7 = 0;
        kb var8_ref_kb = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_42_0 = 0;
        kb stackIn_62_0 = null;
        Object stackIn_62_1 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_177_0 = 0;
        int stackIn_177_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        kb stackIn_236_0 = null;
        Object stackIn_236_1 = null;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        int stackIn_326_0 = 0;
        int stackIn_326_1 = 0;
        int stackIn_337_0 = 0;
        int stackIn_337_1 = 0;
        int stackIn_360_0 = 0;
        int stackIn_360_1 = 0;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        int stackIn_374_0 = 0;
        int stackIn_374_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_41_0 = 0;
        kb stackOut_61_0 = null;
        Object stackOut_61_1 = null;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_153_0 = 0;
        int stackOut_153_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_176_0 = 0;
        int stackOut_176_1 = 0;
        int stackOut_184_0 = 0;
        int stackOut_184_1 = 0;
        int stackOut_205_0 = 0;
        int stackOut_205_1 = 0;
        int stackOut_223_0 = 0;
        int stackOut_223_1 = 0;
        int stackOut_231_0 = 0;
        int stackOut_231_1 = 0;
        Object stackOut_235_0 = null;
        Object stackOut_235_1 = null;
        int stackOut_325_0 = 0;
        int stackOut_325_1 = 0;
        int stackOut_336_0 = 0;
        int stackOut_336_1 = 0;
        int stackOut_359_0 = 0;
        int stackOut_359_1 = 0;
        int stackOut_249_0 = 0;
        int stackOut_249_1 = 0;
        int stackOut_294_0 = 0;
        int stackOut_294_1 = 0;
        int stackOut_371_0 = 0;
        int stackOut_371_1 = 0;
        int stackOut_373_0 = 0;
        int stackOut_373_1 = 0;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 89) {
                break L1;
              } else {
                this.a(59, (byte) -37, 78);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != this.field_p) {
                  break L3;
                } else {
                  this.field_v = 200;
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2_int = this.field_p.field_j - this.field_g;
              var3 = -this.field_h + this.field_p.field_c;
              if (-101 > (var2_int * var2_int - -(var3 * var3) ^ -1)) {
                break L2;
              } else {
                this.field_v = 200;
                break L2;
              }
            }
            L4: {
              L5: {
                this.field_v = 200;
                if (6 != this.field_C) {
                  break L5;
                } else {
                  if (null == this.field_s) {
                    break L5;
                  } else {
                    L6: {
                      if (this.field_j <= 0) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L6;
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_21_0 = stackOut_18_0;
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        var2_int = stackIn_21_0;
                        var3 = 0;
                        var4 = this.field_s.field_w;
                        var5 = 1;
                        if ((this.field_g ^ -1) < (this.field_s.field_g ^ -1)) {
                          break L8;
                        } else {
                          L9: {
                            if ((this.field_h ^ -1) <= (this.field_s.field_h ^ -1)) {
                              break L9;
                            } else {
                              var5 = this.field_f.field_f.field_c;
                              if (var10 == 0) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if ((this.field_s.field_h ^ -1) > (this.field_h ^ -1)) {
                            var5 = -this.field_f.field_f.field_c;
                            if (var10 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var5 = -1;
                      break L7;
                    }
                    var6 = this.field_w;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if ((var6 ^ -1) == (var4 ^ -1)) {
                            break L12;
                          } else {
                            this.field_f.field_f.field_e[var6] = var2_int != 0;
                            stackOut_35_0 = this.field_f.field_f.field_m[var6];
                            stackIn_42_0 = stackOut_35_0 ? 1 : 0;
                            stackIn_36_0 = stackOut_35_0;
                            if (var10 != 0) {
                              break L11;
                            } else {
                              L13: {
                                if (!stackIn_36_0) {
                                  break L13;
                                } else {
                                  var3++;
                                  break L13;
                                }
                              }
                              var6 = var6 + var5;
                              if (var10 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        stackOut_41_0 = var3 ^ -1;
                        stackIn_42_0 = stackOut_41_0;
                        break L11;
                      }
                      L14: {
                        if (stackIn_42_0 < -1) {
                          break L14;
                        } else {
                          if (this.field_j < 100) {
                            this.field_j = this.field_j + 1;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L14;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_j = this.field_j - var3;
                      if ((this.field_j ^ -1) < -1) {
                        break L5;
                      } else {
                        var6 = this.field_w;
                        L15: while (true) {
                          L16: {
                            L17: {
                              if (var4 == var6) {
                                break L17;
                              } else {
                                this.field_f.field_f.field_e[var6] = false;
                                var6 = var6 + var5;
                                if (var10 != 0) {
                                  break L16;
                                } else {
                                  if (var10 == 0) {
                                    continue L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            this.field_f.a(3, this.field_g, (byte) -38, this.field_h);
                            discarded$3 = ea.a(113, mh.field_a[59], (int)(96.0 * this.field_u));
                            this.d(9);
                            this.field_C = -1;
                            break L16;
                          }
                          var6_ref_km = new km(this.field_f.field_o);
                          var7 = 0;
                          var8_ref_kb = (kb) ((Object) var6_ref_km.d(27935));
                          L18: while (true) {
                            L19: {
                              if (var8_ref_kb == null) {
                                break L19;
                              } else {
                                stackOut_61_0 = (kb) (var8_ref_kb);
                                stackOut_61_1 = this;
                                stackIn_236_0 = stackOut_61_0;
                                stackIn_236_1 = stackOut_61_1;
                                stackIn_62_0 = stackOut_61_0;
                                stackIn_62_1 = stackOut_61_1;
                                if (var10 != 0) {
                                  break L4;
                                } else {
                                  L20: {
                                    if (stackIn_62_0 == this) {
                                      break L20;
                                    } else {
                                      if (var8_ref_kb.field_s != this.field_s) {
                                        break L20;
                                      } else {
                                        var7 = 1;
                                        if (var10 == 0) {
                                          break L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  var8_ref_kb = (kb) ((Object) var6_ref_km.b(true));
                                  if (var10 == 0) {
                                    continue L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            if (var7 == 0) {
                              this.field_f.a(3, this.field_s.field_g, (byte) -38, this.field_s.field_h);
                              this.field_s.d(9);
                              this.field_s.field_C = -1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L21: {
                L22: {
                  if (this.field_z) {
                    L23: {
                      if ((this.field_C ^ -1) == -1) {
                        if (this.field_t != 5) {
                          break L23;
                        } else {
                          L24: {
                            var2_int = 5;
                            if (this.field_F < 1) {
                              break L24;
                            } else {
                              var2_int = 10;
                              break L24;
                            }
                          }
                          L25: {
                            if (3 <= this.field_F) {
                              var2_int = 20;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          L26: {
                            if (this.field_E == null) {
                              break L26;
                            } else {
                              if (this.field_E.field_y == 4) {
                                break L26;
                              } else {
                                var2_int = var2_int - this.field_F;
                                break L26;
                              }
                            }
                          }
                          this.a(var2_int, this.field_E, 79);
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    L27: {
                      L28: {
                        if (3 == this.field_C) {
                          if (this.field_t == this.field_n - 45) {
                            this.field_f.field_h.a(-109, new me((double)this.field_x, (double)this.field_A, 9));
                            var2_int = 2 + this.field_F;
                            var3 = this.field_F * 2 + 2;
                            var4_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) -15));
                            L29: while (true) {
                              if (var4_ref_pd == null) {
                                break L28;
                              } else {
                                var5 = -var4_ref_pd.field_u + this.field_x;
                                var6 = this.field_A + -var4_ref_pd.field_z;
                                stackOut_101_0 = -1;
                                stackOut_101_1 = var4_ref_pd.field_o - var4_ref_pd.field_h ^ -1;
                                stackIn_119_0 = stackOut_101_0;
                                stackIn_119_1 = stackOut_101_1;
                                stackIn_102_0 = stackOut_101_0;
                                stackIn_102_1 = stackOut_101_1;
                                if (var10 != 0) {
                                  break L27;
                                } else {
                                  L30: {
                                    if (stackIn_102_0 <= stackIn_102_1) {
                                      break L30;
                                    } else {
                                      if ((var2_int ^ -1) > (Math.abs(var5) ^ -1)) {
                                        break L30;
                                      } else {
                                        if (Math.abs(var6) > var2_int) {
                                          break L30;
                                        } else {
                                          this.a(var3, var4_ref_pd, 45);
                                          if (50 * (this.field_F + 1) > var4_ref_pd.field_i) {
                                            var4_ref_pd.field_i = 50 * (this.field_F + 1);
                                            break L30;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                                  if (var10 == 0) {
                                    continue L29;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                            }
                          } else {
                            break L28;
                          }
                        } else {
                          break L28;
                        }
                      }
                      stackOut_118_0 = 1;
                      stackOut_118_1 = this.field_C;
                      stackIn_119_0 = stackOut_118_0;
                      stackIn_119_1 = stackOut_118_1;
                      break L27;
                    }
                    L31: {
                      L32: {
                        if (stackIn_119_0 != stackIn_119_1) {
                          break L32;
                        } else {
                          L33: {
                            L34: {
                              if (this.field_n - 7 != this.field_t) {
                                break L34;
                              } else {
                                var2_int = 2;
                                var3 = 1;
                                var4 = 0;
                                var5_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) -82));
                                L35: while (true) {
                                  if (var5_ref_pd == null) {
                                    break L34;
                                  } else {
                                    var6 = this.field_A + -var5_ref_pd.field_z;
                                    var7 = -var5_ref_pd.field_u + this.field_x;
                                    stackOut_125_0 = 7;
                                    stackOut_125_1 = var5_ref_pd.field_y;
                                    stackIn_154_0 = stackOut_125_0;
                                    stackIn_154_1 = stackOut_125_1;
                                    stackIn_126_0 = stackOut_125_0;
                                    stackIn_126_1 = stackOut_125_1;
                                    if (var10 != 0) {
                                      break L33;
                                    } else {
                                      L36: {
                                        if (stackIn_126_0 == stackIn_126_1) {
                                          break L36;
                                        } else {
                                          if ((var4 ^ -1) <= -11) {
                                            break L36;
                                          } else {
                                            if (var5_ref_pd.field_o + -var5_ref_pd.field_h <= 0) {
                                              break L36;
                                            } else {
                                              if ((var2_int ^ -1) > (Math.abs(var6) ^ -1)) {
                                                break L36;
                                              } else {
                                                if (var2_int >= Math.abs(var7)) {
                                                  var8 = var5_ref_pd.field_t;
                                                  var9 = 0;
                                                  L37: while (true) {
                                                    if ((var9 ^ -1) <= (this.field_D ^ -1)) {
                                                      break L36;
                                                    } else {
                                                      stackOut_145_0 = this.field_i[var9] ^ -1;
                                                      stackOut_145_1 = var8 ^ -1;
                                                      stackIn_154_0 = stackOut_145_0;
                                                      stackIn_154_1 = stackOut_145_1;
                                                      stackIn_146_0 = stackOut_145_0;
                                                      stackIn_146_1 = stackOut_145_1;
                                                      if (var10 != 0) {
                                                        break L33;
                                                      } else {
                                                        L38: {
                                                          if (stackIn_146_0 == stackIn_146_1) {
                                                            this.a(var3, var5_ref_pd, param0 ^ 127);
                                                            this.field_f.field_h.a(-69, new me((double)this.field_x, (double)this.field_A, 0.1 * ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)this.field_x), ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)this.field_A) * 0.1, 7));
                                                            var4++;
                                                            break L38;
                                                          } else {
                                                            break L38;
                                                          }
                                                        }
                                                        var9++;
                                                        if (var10 == 0) {
                                                          continue L37;
                                                        } else {
                                                          break L36;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var5_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                                      if (var10 == 0) {
                                        continue L35;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_153_0 = this.field_t ^ -1;
                            stackOut_153_1 = this.field_n + -15 ^ -1;
                            stackIn_154_0 = stackOut_153_0;
                            stackIn_154_1 = stackOut_153_1;
                            break L33;
                          }
                          if (stackIn_154_0 == stackIn_154_1) {
                            var2_int = 4;
                            var3 = 1;
                            var4 = 0;
                            var5_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) -12));
                            L39: while (true) {
                              if (null == var5_ref_pd) {
                                break L32;
                              } else {
                                var6 = -var5_ref_pd.field_z + this.field_A;
                                var7 = -var5_ref_pd.field_u + this.field_x;
                                stackOut_158_0 = -8;
                                stackOut_158_1 = var5_ref_pd.field_y ^ -1;
                                stackIn_185_0 = stackOut_158_0;
                                stackIn_185_1 = stackOut_158_1;
                                stackIn_159_0 = stackOut_158_0;
                                stackIn_159_1 = stackOut_158_1;
                                if (var10 != 0) {
                                  break L31;
                                } else {
                                  L40: {
                                    if (stackIn_159_0 == stackIn_159_1) {
                                      break L40;
                                    } else {
                                      if (-7 >= (var4 ^ -1)) {
                                        break L40;
                                      } else {
                                        if ((-var5_ref_pd.field_h + var5_ref_pd.field_o ^ -1) >= -1) {
                                          break L40;
                                        } else {
                                          if (var2_int < Math.abs(var6)) {
                                            break L40;
                                          } else {
                                            if (var2_int < Math.abs(var7)) {
                                              break L40;
                                            } else {
                                              var8 = var5_ref_pd.field_t;
                                              var9 = 0;
                                              L41: while (true) {
                                                if ((var9 ^ -1) <= (this.field_D ^ -1)) {
                                                  break L40;
                                                } else {
                                                  stackOut_176_0 = var8;
                                                  stackOut_176_1 = this.field_i[var9];
                                                  stackIn_185_0 = stackOut_176_0;
                                                  stackIn_185_1 = stackOut_176_1;
                                                  stackIn_177_0 = stackOut_176_0;
                                                  stackIn_177_1 = stackOut_176_1;
                                                  if (var10 != 0) {
                                                    break L31;
                                                  } else {
                                                    L42: {
                                                      if (stackIn_177_0 == stackIn_177_1) {
                                                        this.a(var3, var5_ref_pd, 73);
                                                        this.field_f.field_h.a(param0 + -163, new me((double)this.field_x, (double)this.field_A, ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)this.field_x) * 0.1, 0.1 * ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)this.field_A), 7));
                                                        var4++;
                                                        break L42;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                    var9++;
                                                    if (var10 == 0) {
                                                      continue L41;
                                                    } else {
                                                      break L40;
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
                                  var5_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                                  if (var10 == 0) {
                                    continue L39;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          } else {
                            break L32;
                          }
                        }
                      }
                      stackOut_184_0 = this.field_C ^ -1;
                      stackOut_184_1 = -3;
                      stackIn_185_0 = stackOut_184_0;
                      stackIn_185_1 = stackOut_184_1;
                      break L31;
                    }
                    if (stackIn_185_0 != stackIn_185_1) {
                      break L22;
                    } else {
                      if ((this.field_t ^ -1) == -51) {
                        L43: {
                          this.field_v = this.field_v - 4;
                          var2_int = 2;
                          var3 = 30;
                          if ((this.field_F ^ -1) > -2) {
                            break L43;
                          } else {
                            var3 = 44;
                            var2_int = 2;
                            break L43;
                          }
                        }
                        L44: {
                          if (-3 < (this.field_F ^ -1)) {
                            break L44;
                          } else {
                            var2_int = 3;
                            var3 = 60;
                            break L44;
                          }
                        }
                        L45: {
                          if (-4 >= (this.field_F ^ -1)) {
                            var3 = 74;
                            var2_int = 3;
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        L46: {
                          if ((this.field_F ^ -1) <= -5) {
                            var3 = 90;
                            var2_int = 4;
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        var4_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) 119));
                        L47: while (true) {
                          if (var4_ref_pd == null) {
                            break L22;
                          } else {
                            var5 = -var4_ref_pd.field_z + this.field_A;
                            var6 = -var4_ref_pd.field_u + this.field_x;
                            stackOut_205_0 = -8;
                            stackOut_205_1 = var4_ref_pd.field_y ^ -1;
                            stackIn_232_0 = stackOut_205_0;
                            stackIn_232_1 = stackOut_205_1;
                            stackIn_206_0 = stackOut_205_0;
                            stackIn_206_1 = stackOut_205_1;
                            if (var10 != 0) {
                              break L21;
                            } else {
                              L48: {
                                if (stackIn_206_0 == stackIn_206_1) {
                                  break L48;
                                } else {
                                  if (4 == var4_ref_pd.field_y) {
                                    break L48;
                                  } else {
                                    if ((var4_ref_pd.field_o - var4_ref_pd.field_h ^ -1) >= -1) {
                                      break L48;
                                    } else {
                                      if (var2_int < Math.abs(var5)) {
                                        break L48;
                                      } else {
                                        if (var2_int < Math.abs(var6)) {
                                          break L48;
                                        } else {
                                          var7 = var4_ref_pd.field_t;
                                          var8 = 0;
                                          L49: while (true) {
                                            if (var8 >= this.field_D) {
                                              break L48;
                                            } else {
                                              stackOut_223_0 = var7 ^ -1;
                                              stackOut_223_1 = this.field_i[var8] ^ -1;
                                              stackIn_232_0 = stackOut_223_0;
                                              stackIn_232_1 = stackOut_223_1;
                                              stackIn_224_0 = stackOut_223_0;
                                              stackIn_224_1 = stackOut_223_1;
                                              if (var10 != 0) {
                                                break L21;
                                              } else {
                                                L50: {
                                                  if (stackIn_224_0 != stackIn_224_1) {
                                                    break L50;
                                                  } else {
                                                    this.a(var3, var4_ref_pd, param0 + -29);
                                                    break L50;
                                                  }
                                                }
                                                var8++;
                                                if (var10 == 0) {
                                                  continue L49;
                                                } else {
                                                  break L48;
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
                              var4_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                              if (var10 == 0) {
                                continue L47;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      } else {
                        break L22;
                      }
                    }
                  } else {
                    break L22;
                  }
                }
                stackOut_231_0 = this.field_C ^ -1;
                stackOut_231_1 = -6;
                stackIn_232_0 = stackOut_231_0;
                stackIn_232_1 = stackOut_231_1;
                break L21;
              }
              L51: {
                if (stackIn_232_0 != stackIn_232_1) {
                  break L51;
                } else {
                  this.b((byte) 12);
                  break L51;
                }
              }
              stackOut_235_0 = this;
              stackOut_235_1 = this;
              stackIn_236_0 = (kb) ((Object) stackOut_235_0);
              stackIn_236_1 = stackOut_235_1;
              break L4;
            }
            L52: {
              this.field_t = ((kb) (this)).field_t - 1;
              if (0 < this.field_t) {
                break L52;
              } else {
                if (6 == this.field_C) {
                  break L52;
                } else {
                  L53: {
                    this.field_z = false;
                    if (this.field_v > 0) {
                      break L53;
                    } else {
                      this.field_t = 5;
                      if (var10 == 0) {
                        break L52;
                      } else {
                        break L53;
                      }
                    }
                  }
                  L54: {
                    L55: {
                      L56: {
                        L57: {
                          this.field_t = 5;
                          var2 = null;
                          if (4 == this.field_C) {
                            L58: {
                              var3_ref_pd = this.field_E;
                              var4 = -10000;
                              if (var3_ref_pd == null) {
                                break L58;
                              } else {
                                if (0 >= -var3_ref_pd.field_h + var3_ref_pd.field_o) {
                                  break L58;
                                } else {
                                  L59: {
                                    var5 = this.field_h - var3_ref_pd.field_z;
                                    var6 = this.field_g - var3_ref_pd.field_u;
                                    if (var3_ref_pd.field_y != 9) {
                                      break L59;
                                    } else {
                                      if (0 == var3_ref_pd.field_E) {
                                        break L58;
                                      } else {
                                        break L59;
                                      }
                                    }
                                  }
                                  if (-1 <= (-var3_ref_pd.field_h + var3_ref_pd.field_o ^ -1)) {
                                    break L58;
                                  } else {
                                    if ((Math.abs(var5) ^ -1) < (this.field_l ^ -1)) {
                                      break L58;
                                    } else {
                                      if ((Math.abs(var6) ^ -1) < (this.field_l ^ -1)) {
                                        break L58;
                                      } else {
                                        var7 = var3_ref_pd.field_t;
                                        var8 = 0;
                                        L60: while (true) {
                                          if ((var8 ^ -1) <= (this.field_D ^ -1)) {
                                            break L58;
                                          } else {
                                            stackOut_325_0 = this.field_i[var8];
                                            stackOut_325_1 = var7;
                                            stackIn_374_0 = stackOut_325_0;
                                            stackIn_374_1 = stackOut_325_1;
                                            stackIn_326_0 = stackOut_325_0;
                                            stackIn_326_1 = stackOut_325_1;
                                            if (var10 != 0) {
                                              break L55;
                                            } else {
                                              L61: {
                                                if (stackIn_326_0 != stackIn_326_1) {
                                                  break L61;
                                                } else {
                                                  var2 = var3_ref_pd;
                                                  break L61;
                                                }
                                              }
                                              var8++;
                                              if (var10 == 0) {
                                                continue L60;
                                              } else {
                                                break L58;
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
                            if (null == var2) {
                              var3_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) 127));
                              L62: while (true) {
                                if (var3_ref_pd == null) {
                                  break L57;
                                } else {
                                  var5 = this.field_h - var3_ref_pd.field_z;
                                  var6 = -var3_ref_pd.field_u + this.field_g;
                                  stackOut_336_0 = var3_ref_pd.field_y;
                                  stackOut_336_1 = 4;
                                  stackIn_374_0 = stackOut_336_0;
                                  stackIn_374_1 = stackOut_336_1;
                                  stackIn_337_0 = stackOut_336_0;
                                  stackIn_337_1 = stackOut_336_1;
                                  if (var10 != 0) {
                                    break L55;
                                  } else {
                                    L63: {
                                      if (stackIn_337_0 == stackIn_337_1) {
                                        break L63;
                                      } else {
                                        L64: {
                                          if (-10 != (var3_ref_pd.field_y ^ -1)) {
                                            break L64;
                                          } else {
                                            if (var3_ref_pd.field_E == 0) {
                                              break L63;
                                            } else {
                                              break L64;
                                            }
                                          }
                                        }
                                        if ((-var3_ref_pd.field_h + var3_ref_pd.field_o ^ -1) >= -1) {
                                          break L63;
                                        } else {
                                          if (Math.abs(var5) > this.field_l) {
                                            break L63;
                                          } else {
                                            if ((Math.abs(var6) ^ -1) >= (this.field_l ^ -1)) {
                                              var7 = var3_ref_pd.field_t;
                                              var8 = 0;
                                              L65: while (true) {
                                                if (this.field_D <= var8) {
                                                  break L63;
                                                } else {
                                                  stackOut_359_0 = var7 ^ -1;
                                                  stackOut_359_1 = this.field_i[var8] ^ -1;
                                                  stackIn_374_0 = stackOut_359_0;
                                                  stackIn_374_1 = stackOut_359_1;
                                                  stackIn_360_0 = stackOut_359_0;
                                                  stackIn_360_1 = stackOut_359_1;
                                                  if (var10 != 0) {
                                                    break L55;
                                                  } else {
                                                    L66: {
                                                      if (stackIn_360_0 == stackIn_360_1) {
                                                        var9 = Math.abs(var5) + (Math.abs(var6) + -(Math.abs(var5) * Math.abs(var6)));
                                                        if (var9 > var4) {
                                                          var2 = var3_ref_pd;
                                                          var4 = var9;
                                                          break L66;
                                                        } else {
                                                          break L66;
                                                        }
                                                      } else {
                                                        break L66;
                                                      }
                                                    }
                                                    var8++;
                                                    if (var10 == 0) {
                                                      continue L65;
                                                    } else {
                                                      break L63;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var3_ref_pd = (pd) ((Object) this.field_f.field_r.d(853));
                                    if (var10 == 0) {
                                      continue L62;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L57;
                            }
                          } else {
                            var3 = 10000;
                            var4_ref_pd = (pd) ((Object) this.field_f.field_r.b((byte) 124));
                            L67: while (true) {
                              L68: {
                                if (var4_ref_pd == null) {
                                  break L68;
                                } else {
                                  var5 = this.field_h + -var4_ref_pd.field_z;
                                  var6 = this.field_g - var4_ref_pd.field_u;
                                  stackOut_249_0 = 7;
                                  stackOut_249_1 = var4_ref_pd.field_y;
                                  stackIn_373_0 = stackOut_249_0;
                                  stackIn_373_1 = stackOut_249_1;
                                  stackIn_250_0 = stackOut_249_0;
                                  stackIn_250_1 = stackOut_249_1;
                                  if (var10 != 0) {
                                    break L56;
                                  } else {
                                    L69: {
                                      L70: {
                                        if (stackIn_250_0 != stackIn_250_1) {
                                          break L70;
                                        } else {
                                          if (2 == this.field_C) {
                                            break L69;
                                          } else {
                                            break L70;
                                          }
                                        }
                                      }
                                      L71: {
                                        if (4 != var4_ref_pd.field_y) {
                                          break L71;
                                        } else {
                                          if (0 == this.field_C) {
                                            break L71;
                                          } else {
                                            if (this.field_C == 3) {
                                              break L71;
                                            } else {
                                              if ((this.field_C ^ -1) == -2) {
                                                break L71;
                                              } else {
                                                if (5 != this.field_C) {
                                                  break L69;
                                                } else {
                                                  break L71;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L72: {
                                        if (3 == this.field_C) {
                                          break L72;
                                        } else {
                                          if (-6 == (this.field_C ^ -1)) {
                                            break L72;
                                          } else {
                                            if (9 != var4_ref_pd.field_y) {
                                              break L72;
                                            } else {
                                              if ((var4_ref_pd.field_E ^ -1) == -1) {
                                                break L69;
                                              } else {
                                                break L72;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (-1 <= (-var4_ref_pd.field_h + var4_ref_pd.field_o ^ -1)) {
                                        break L69;
                                      } else {
                                        if (Math.abs(var5) > this.field_l) {
                                          break L69;
                                        } else {
                                          if ((Math.abs(var6) ^ -1) < (this.field_l ^ -1)) {
                                            break L69;
                                          } else {
                                            var7 = var4_ref_pd.field_t;
                                            var8 = 0;
                                            L73: while (true) {
                                              if (this.field_D <= var8) {
                                                break L69;
                                              } else {
                                                stackOut_294_0 = var7 ^ -1;
                                                stackOut_294_1 = this.field_i[var8] ^ -1;
                                                stackIn_373_0 = stackOut_294_0;
                                                stackIn_373_1 = stackOut_294_1;
                                                stackIn_295_0 = stackOut_294_0;
                                                stackIn_295_1 = stackOut_294_1;
                                                if (var10 != 0) {
                                                  break L56;
                                                } else {
                                                  L74: {
                                                    if (stackIn_295_0 == stackIn_295_1) {
                                                      var9 = var5 * var5 - -(var6 * var6);
                                                      if ((var3 ^ -1) < (var9 ^ -1)) {
                                                        var2 = var4_ref_pd;
                                                        var3 = var9;
                                                        break L74;
                                                      } else {
                                                        break L74;
                                                      }
                                                    } else {
                                                      break L74;
                                                    }
                                                  }
                                                  var8++;
                                                  if (var10 == 0) {
                                                    continue L73;
                                                  } else {
                                                    break L69;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var4_ref_pd = (pd) ((Object) this.field_f.field_r.d(param0 ^ 780));
                                    if (var10 == 0) {
                                      continue L67;
                                    } else {
                                      break L68;
                                    }
                                  }
                                }
                              }
                              break L57;
                            }
                          }
                        }
                        if (var2 == null) {
                          break L54;
                        } else {
                          stackOut_371_0 = 5 + this.field_C * 5;
                          stackOut_371_1 = this.field_F;
                          stackIn_373_0 = stackOut_371_0;
                          stackIn_373_1 = stackOut_371_1;
                          break L56;
                        }
                      }
                      var4 = stackIn_373_0 + stackIn_373_1;
                      stackOut_373_0 = this.field_C ^ -1;
                      stackOut_373_1 = -6;
                      stackIn_374_0 = stackOut_373_0;
                      stackIn_374_1 = stackOut_373_1;
                      break L55;
                    }
                    L75: {
                      if (stackIn_374_0 == stackIn_374_1) {
                        var4 = 58;
                        break L75;
                      } else {
                        break L75;
                      }
                    }
                    L76: {
                      L77: {
                        L78: {
                          L79: {
                            L80: {
                              L81: {
                                L82: {
                                  discarded$4 = ea.a(46, mh.field_a[var4], (int)(this.field_u * 96.0));
                                  this.field_v = this.field_v - 1;
                                  this.field_z = true;
                                  this.field_q = (int)(Math.atan2((double)(this.field_g + -((pd) (var2)).field_u), (double)(-((pd) (var2)).field_z + this.field_h)) * 65536.0 / 6.283185307179586);
                                  var5 = this.field_C;
                                  if (-1 == (var5 ^ -1)) {
                                    break L82;
                                  } else {
                                    if (-2 == (var5 ^ -1)) {
                                      break L81;
                                    } else {
                                      if (2 == var5) {
                                        break L80;
                                      } else {
                                        L83: {
                                          if (-5 != (var5 ^ -1)) {
                                            break L83;
                                          } else {
                                            if (var10 == 0) {
                                              break L79;
                                            } else {
                                              break L83;
                                            }
                                          }
                                        }
                                        L84: {
                                          if (3 != var5) {
                                            break L84;
                                          } else {
                                            if (var10 == 0) {
                                              break L78;
                                            } else {
                                              break L84;
                                            }
                                          }
                                        }
                                        if (5 != var5) {
                                          break L76;
                                        } else {
                                          if (var10 == 0) {
                                            break L77;
                                          } else {
                                            break L82;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L85: {
                                  this.field_t = 50;
                                  if (-2 != (this.field_F ^ -1)) {
                                    break L85;
                                  } else {
                                    this.field_t = 50;
                                    break L85;
                                  }
                                }
                                L86: {
                                  if (this.field_F != 2) {
                                    break L86;
                                  } else {
                                    this.field_t = 25;
                                    break L86;
                                  }
                                }
                                L87: {
                                  if (3 == this.field_F) {
                                    this.field_t = 40;
                                    break L87;
                                  } else {
                                    break L87;
                                  }
                                }
                                L88: {
                                  this.field_A = ((pd) (var2)).field_z;
                                  if (4 != this.field_F) {
                                    break L88;
                                  } else {
                                    this.field_t = 25;
                                    break L88;
                                  }
                                }
                                this.field_E = (pd) (var2);
                                this.field_x = ((pd) (var2)).field_u;
                                if (var10 == 0) {
                                  break L76;
                                } else {
                                  break L81;
                                }
                              }
                              L89: {
                                var3 = 10;
                                this.field_t = 100;
                                if (this.field_F != 1) {
                                  break L89;
                                } else {
                                  this.field_t = 80;
                                  break L89;
                                }
                              }
                              L90: {
                                if (-3 == (this.field_F ^ -1)) {
                                  this.field_t = 60;
                                  break L90;
                                } else {
                                  break L90;
                                }
                              }
                              L91: {
                                if (3 == this.field_F) {
                                  this.field_t = 40;
                                  break L91;
                                } else {
                                  break L91;
                                }
                              }
                              L92: {
                                this.field_x = ((pd) (var2)).field_u;
                                if (-5 == (this.field_F ^ -1)) {
                                  this.field_t = 20;
                                  break L92;
                                } else {
                                  break L92;
                                }
                              }
                              this.field_E = (pd) (var2);
                              this.field_A = ((pd) (var2)).field_z;
                              this.a(var3, (pd) (var2), param0 ^ 71);
                              this.field_f.field_h.a(-122, new me((double)this.field_x, (double)this.field_A, 7));
                              if (var10 == 0) {
                                break L76;
                              } else {
                                break L80;
                              }
                            }
                            this.field_t = 100;
                            this.field_A = ((pd) (var2)).field_z;
                            this.field_x = ((pd) (var2)).field_u;
                            if (var10 == 0) {
                              break L76;
                            } else {
                              break L79;
                            }
                          }
                          L93: {
                            var3 = 20;
                            this.field_t = 5 + -this.field_F;
                            this.field_x = ((pd) (var2)).field_u;
                            this.field_A = ((pd) (var2)).field_z;
                            if (this.field_E != var2) {
                              break L93;
                            } else {
                              this.a(var3, (pd) (var2), -117);
                              if (var10 == 0) {
                                break L76;
                              } else {
                                break L93;
                              }
                            }
                          }
                          this.field_t = 100;
                          this.field_E = (pd) (var2);
                          if (var10 == 0) {
                            break L76;
                          } else {
                            break L78;
                          }
                        }
                        L94: {
                          this.field_t = 100;
                          if ((this.field_F ^ -1) != -2) {
                            break L94;
                          } else {
                            this.field_t = 90;
                            break L94;
                          }
                        }
                        L95: {
                          if (2 != this.field_F) {
                            break L95;
                          } else {
                            this.field_t = 80;
                            break L95;
                          }
                        }
                        L96: {
                          if ((this.field_F ^ -1) != -4) {
                            break L96;
                          } else {
                            this.field_t = 70;
                            break L96;
                          }
                        }
                        L97: {
                          if (this.field_F != 4) {
                            break L97;
                          } else {
                            this.field_t = 60;
                            break L97;
                          }
                        }
                        this.field_x = ((pd) (var2)).field_u;
                        this.field_A = ((pd) (var2)).field_z;
                        if (var10 == 0) {
                          break L76;
                        } else {
                          break L77;
                        }
                      }
                      L98: {
                        L99: {
                          this.field_t = 500;
                          this.field_A = ((pd) (var2)).field_z;
                          this.field_x = ((pd) (var2)).field_u;
                          var3 = 5;
                          if (-2 == (this.field_F ^ -1)) {
                            break L99;
                          } else {
                            L100: {
                              if ((this.field_F ^ -1) != -3) {
                                break L100;
                              } else {
                                var3 = 20;
                                if (var10 == 0) {
                                  break L98;
                                } else {
                                  break L100;
                                }
                              }
                            }
                            L101: {
                              if (3 == this.field_F) {
                                break L101;
                              } else {
                                if (-5 == (this.field_F ^ -1)) {
                                  var3 = 80;
                                  if (var10 == 0) {
                                    break L98;
                                  } else {
                                    break L101;
                                  }
                                } else {
                                  break L98;
                                }
                              }
                            }
                            var3 = 40;
                            if (var10 == 0) {
                              break L98;
                            } else {
                              break L99;
                            }
                          }
                        }
                        var3 = 10;
                        break L98;
                      }
                      L102: {
                        this.field_y = 0;
                        discarded$5 = this.a(this.field_x, (float)this.field_g + 0.5f, 38, this.field_A, (float)(-2 + this.field_h));
                        if (-8 != (((pd) (var2)).field_y ^ -1)) {
                          break L102;
                        } else {
                          ((pd) (var2)).field_f = 120;
                          if (var10 == 0) {
                            break L76;
                          } else {
                            break L102;
                          }
                        }
                      }
                      ((pd) (var2)).field_f = 60;
                      this.a(var3, (pd) (var2), param0 + 27);
                      break L76;
                    }
                    this.field_n = this.field_t;
                    if (var10 == 0) {
                      break L52;
                    } else {
                      break L54;
                    }
                  }
                  this.field_t = 5;
                  break L52;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (var2), "kb.J(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_2_0 = 0;
        var16 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == -7) {
              L1: {
                L2: {
                  var7_int = -this.field_g + param4;
                  var8 = param5 + -this.field_h;
                  var11 = 5;
                  if (1 == this.field_f.field_m) {
                    break L2;
                  } else {
                    if (-3 == (this.field_f.field_m ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var11 = 1;
                break L1;
              }
              var12 = 1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (param2 < var12) {
                      break L5;
                    } else {
                      var10 = this.field_h + var12 * var8 / param2;
                      var9 = var7_int * var12 / param2 + this.field_g;
                      stackOut_13_0 = this.field_f.field_f.a(var9, true, var10);
                      stackIn_52_0 = stackOut_13_0 ? 1 : 0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var16 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_14_0) {
                            break L6;
                          } else {
                            var13 = var9 + this.field_f.field_f.field_c * var10;
                            var14 = 1;
                            var15 = 0;
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if ((var15 ^ -1) <= (param3 ^ -1)) {
                                    break L9;
                                  } else {
                                    stackOut_19_0 = this.field_i[var15] ^ -1;
                                    stackOut_19_1 = var13 ^ -1;
                                    stackIn_28_0 = stackOut_19_0;
                                    stackIn_28_1 = stackOut_19_1;
                                    stackIn_20_0 = stackOut_19_0;
                                    stackIn_20_1 = stackOut_19_1;
                                    if (var16 != 0) {
                                      break L8;
                                    } else {
                                      L10: {
                                        if (stackIn_20_0 != stackIn_20_1) {
                                          break L10;
                                        } else {
                                          var14 = 0;
                                          if (var16 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var15++;
                                      if (var16 == 0) {
                                        continue L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                stackOut_27_0 = (var10 + -this.field_h) * (var10 + -this.field_h) + (-this.field_g + var9) * (-this.field_g + var9);
                                stackOut_27_1 = param2 * param2;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                break L8;
                              }
                              L11: {
                                if (stackIn_28_0 > stackIn_28_1) {
                                  var14 = 0;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (var14 == 0) {
                                  break L12;
                                } else {
                                  if ((param1 ^ -1) < (var12 ^ -1)) {
                                    break L12;
                                  } else {
                                    if ((var9 ^ -1) >= (var11 ^ -1)) {
                                      break L12;
                                    } else {
                                      if (-7 == (this.field_f.field_f.field_o[var9 - -(this.field_f.field_f.field_c * var10)] ^ -1)) {
                                        break L12;
                                      } else {
                                        if (-11 != (this.field_f.field_f.field_o[this.field_f.field_f.field_c * var10 + var9] ^ -1)) {
                                          this.field_i[param3] = var13;
                                          param3++;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (var16 == 0) {
                                var12++;
                                if (var16 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_48_0 = param3;
                        stackIn_49_0 = stackOut_48_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackOut_51_0 = param3;
                  stackIn_52_0 = stackOut_51_0;
                  break L4;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -87;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var7), "kb.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_52_0;
          } else {
            return stackIn_49_0;
          }
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                this.field_r = (ok[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != this.field_s) {
                  L4: {
                    L5: {
                      var2_int = this.field_s.field_w;
                      var3 = 1;
                      if ((this.field_g ^ -1) >= (this.field_s.field_g ^ -1)) {
                        break L5;
                      } else {
                        var3 = -1;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_h >= this.field_s.field_h) {
                        break L6;
                      } else {
                        var3 = this.field_f.field_f.field_c;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if ((this.field_s.field_h ^ -1) > (this.field_h ^ -1)) {
                      var3 = -this.field_f.field_f.field_c;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = this.field_w;
                  L7: while (true) {
                    if (var2_int == var4) {
                      break L3;
                    } else {
                      this.field_f.field_f.field_e[var4] = false;
                      var4 = var4 + var3;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          continue L7;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.L(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 9) {
                break L1;
              } else {
                this.field_j = -82;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((this.field_C ^ -1) != 0) {
                  var2_int = oj.a((byte) 47, this.field_C);
                  var3 = this.field_g;
                  L4: while (true) {
                    if ((var2_int + this.field_g ^ -1) >= (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (var5 != 0) {
                        break L2;
                      } else {
                        var4 = this.field_h;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (this.field_h + var2_int <= var4) {
                                break L7;
                              } else {
                                this.field_f.field_f.field_o[var3 + var4 * this.field_f.field_f.field_c] = 9;
                                var4++;
                                if (var5 != 0) {
                                  break L6;
                                } else {
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var3++;
                            break L6;
                          }
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "kb.M(" + param0 + ')');
        }
    }

    kb(int param0, int param1, int param2, int param3, lb param4, f param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        this.field_n = 0;
        try {
          L0: {
            L1: {
              this.field_z = false;
              this.field_C = param2;
              this.field_p = param4;
              this.field_v = 200;
              this.field_t = 0;
              this.field_f = param5;
              this.field_F = param3;
              this.b(0, param1, param0);
              if ((this.field_D ^ -1) < -1) {
                this.field_q = (int)(Math.atan2((double)(this.field_g - this.field_i[0] % this.field_f.field_f.field_c), (double)(-(this.field_i[0] / this.field_f.field_f.field_c) + this.field_h)) * 65536.0 / 6.283185307179586);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_o = this.field_q;
              if (6 != this.field_C) {
                break L2;
              } else {
                this.field_j = 100;
                break L2;
              }
            }
            this.field_E = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var7);
            stackOut_9_1 = new StringBuilder().append("kb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
    }
}
