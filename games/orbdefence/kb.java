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
              ((kb) this).field_g = param2;
              ((kb) this).field_h = param1;
              var4_int = 10;
              var5 = 2;
              if (((kb) this).field_C != 1) {
                break L1;
              } else {
                var4_int = 8 + 2 * ((kb) this).field_F;
                var5 = 2;
                break L1;
              }
            }
            L2: {
              if (((kb) this).field_C != 4) {
                break L2;
              } else {
                var4_int = 30;
                var5 = 5;
                break L2;
              }
            }
            L3: {
              if (((kb) this).field_C != 2) {
                break L3;
              } else {
                L4: {
                  var4_int = 20;
                  if (((kb) this).field_F == 3) {
                    var4_int = 25;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (4 != ((kb) this).field_F) {
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
              if (((kb) this).field_C == 3) {
                var4_int = 6;
                var5 = 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((kb) this).field_C == 5) {
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
                  ((kb) this).field_i = new int[(1 + 2 * var4_int) * (2 * var4_int - -1) - (var5 * 2 + -1) * ((var5 + -1) * 2 - -1)];
                  ((kb) this).field_l = var4_int;
                  ((kb) this).field_D = param0;
                  if (((kb) this).field_C == 0) {
                    break L10;
                  } else {
                    if (3 == ((kb) this).field_C) {
                      break L10;
                    } else {
                      L11: {
                        L12: {
                          if (((kb) this).field_C == 1) {
                            break L12;
                          } else {
                            if (2 == ((kb) this).field_C) {
                              break L12;
                            } else {
                              if (((kb) this).field_C != 5) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var6_int = ((kb) this).field_g;
                        var7 = ((kb) this).field_h;
                        ((kb) this).field_g = var6_int;
                        L13: while (true) {
                          stackOut_35_0 = ((kb) this).field_g;
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
                                    ((kb) this).field_h = stackIn_38_1;
                                    L17: while (true) {
                                      L18: {
                                        if (((kb) this).field_h >= var7 - -1) {
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
                                                    ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, -var4_int + ((kb) this).field_g, var8 + ((kb) this).field_h);
                                                    ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, var8 + ((kb) this).field_g, var4_int + ((kb) this).field_h);
                                                    ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, var4_int + ((kb) this).field_g, ((kb) this).field_h - var8);
                                                    ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g + -var8, ((kb) this).field_h + -var4_int);
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
                                                ((kb) this).field_h = ((kb) this).field_h + 1;
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
                                      ((kb) this).field_g = ((kb) this).field_g + 1;
                                      if (var9 == 0) {
                                        continue L13;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              ((kb) this).field_g = var6_int;
                              stackOut_51_0 = this;
                              stackOut_51_1 = var7;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              break L15;
                            }
                            ((kb) this).field_h = stackIn_52_1;
                            if (var9 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      if (((kb) this).field_C != 4) {
                        break L9;
                      } else {
                        ((kb) this).field_g = ((kb) this).field_g + 1;
                        var4_int++;
                        ((kb) this).field_h = ((kb) this).field_h + 1;
                        var6_int = -var4_int;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (var4_int <= var6_int) {
                                break L24;
                              } else {
                                ((kb) this).field_D = this.a(param0 ^ -7, var5, var4_int, ((kb) this).field_D, -var4_int + ((kb) this).field_g, var6_int + ((kb) this).field_h);
                                ((kb) this).field_D = this.a(param0 ^ -7, var5, var4_int, ((kb) this).field_D, var6_int + ((kb) this).field_g, ((kb) this).field_h + var4_int);
                                ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, var4_int + ((kb) this).field_g, -var6_int + ((kb) this).field_h);
                                ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, -var6_int + ((kb) this).field_g, -var4_int + ((kb) this).field_h);
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
                            ((kb) this).field_h = ((kb) this).field_h - 1;
                            var4_int--;
                            ((kb) this).field_g = ((kb) this).field_g - 1;
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
                    ((kb) this).field_D = this.a(param0 ^ -7, var5, var4_int, ((kb) this).field_D, -var4_int + ((kb) this).field_g, ((kb) this).field_h + var6_int);
                    ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g - -var6_int, var4_int + ((kb) this).field_h);
                    ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g - -var4_int, ((kb) this).field_h - var6_int);
                    stackOut_66_0 = this;
                    stackIn_71_0 = stackOut_66_0;
                    stackIn_67_0 = stackOut_66_0;
                    if (var9 != 0) {
                      break L8;
                    } else {
                      ((kb) this).field_D = this.a(-7, var5, var4_int, ((kb) this).field_D, ((kb) this).field_g - var6_int, -var4_int + ((kb) this).field_h);
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
            var6 = ((kb) this).field_i;
            ((kb) this).field_i = new int[((kb) this).field_D];
            var7 = 0;
            L26: while (true) {
              L27: {
                L28: {
                  if (var7 >= ((kb) this).field_D) {
                    break L28;
                  } else {
                    ((kb) this).field_i[var7] = var6[var7];
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
                ((kb) this).field_w = ((kb) this).field_g - -(((kb) this).field_f.field_f.field_c * ((kb) this).field_h);
                break L27;
              }
              L29: {
                L30: {
                  if (5 == ((kb) this).field_C) {
                    ((kb) this).field_y = 0;
                    ((kb) this).field_k = 0;
                    ((kb) this).field_B = 0;
                    ((kb) this).field_r = new ok[(1 + ((kb) this).field_F) * 25 + 1];
                    var7 = 0;
                    L31: while (true) {
                      if (~var7 <= ~((kb) this).field_r.length) {
                        break L30;
                      } else {
                        ((kb) this).field_r[var7] = new ok();
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
          throw dd.a((Throwable) (Object) var4, "kb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 27) {
              if (((kb) this).field_k != ((kb) this).field_B) {
                if (~((kb) this).field_k > ~((kb) this).field_B) {
                  stackOut_9_0 = ((kb) this).field_B + -((kb) this).field_k;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((kb) this).field_B + -((kb) this).field_k + ((kb) this).field_r.length;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -2;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "kb.A(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    private final boolean a(int param0, float param1, int param2, int param3, float param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var7 = -102 % ((-37 - param2) / 56);
            var6_int = (((kb) this).field_B - -1) % ((kb) this).field_r.length;
            if (~((kb) this).field_k != ~var6_int) {
              ((kb) this).field_r[((kb) this).field_B].field_e = param1;
              ((kb) this).field_r[((kb) this).field_B].field_d = param4;
              ((kb) this).field_r[((kb) this).field_B].field_b = param0;
              ((kb) this).field_r[((kb) this).field_B].field_g = param3;
              ((kb) this).field_r[((kb) this).field_B].field_c = ((kb) this).field_y - -60;
              ((kb) this).field_B = var6_int;
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var6, "kb.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0 != 0;
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
                                  stackOut_7_1 = ~var2[var3_int];
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
                              stackOut_17_1 = ~var3_int;
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
                              if (var4 >= 24) {
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
                stackOut_30_0 = (RuntimeException) runtimeException;
                stackOut_30_1 = new StringBuilder().append("kb.D(");
                stackIn_33_0 = stackOut_30_0;
                stackIn_33_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (param0 == null) {
                  stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                  stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                  stackOut_33_2 = "null";
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  break L12;
                } else {
                  stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                  stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                  stackOut_31_2 = "{...}";
                  stackIn_34_0 = stackOut_31_0;
                  stackIn_34_1 = stackOut_31_1;
                  stackIn_34_2 = stackOut_31_2;
                  break L12;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
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
                          if (param2.length() == 0) {
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
                      break L1;
                    } else {
                      return;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    break L4;
                  }
                }
                g.a(1, param0);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("kb.B(");
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_19_1 = stackOut_16_1;
                  stackIn_19_2 = stackOut_16_2;
                  break L6;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, pd param1, int param2) {
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
            if (-param1.field_h + param1.field_o <= 0) {
              ((kb) this).field_f.field_h.a(-74, (ca) (Object) new me((double)param1.field_u, (double)param1.field_z, 1));
              return;
            } else {
              L1: {
                if (null == ((kb) this).field_p) {
                  break L1;
                } else {
                  nh.field_b = nh.field_b + param0;
                  ((kb) this).field_p.field_d = ((kb) this).field_p.field_d + param0;
                  break L1;
                }
              }
              L2: {
                param1.field_h = param1.field_h + param0;
                var4_int = 79 % ((param2 - -47) / 56);
                if (null == param1.field_p) {
                  var5 = ((kb) this).field_g - param1.field_u;
                  var6 = -param1.field_z + ((kb) this).field_h;
                  if (var6 * var6 + var5 * var5 < 100) {
                    param1.field_B = 0;
                    param1.field_p = (kb) this;
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
                          hf discarded$2 = ea.a(53, mh.field_a[54], (int)(96.0 * param1.field_v));
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      hf discarded$3 = ea.a(11, mh.field_a[(int)(Math.random() * 5.0) + 49], (int)(96.0 * param1.field_v));
                      break L5;
                    }
                    L7: {
                      param1.field_h = param1.field_h - param1.field_o;
                      param1.field_o = 0;
                      if (((kb) this).field_F == 4) {
                        L8: {
                          if (((kb) this).field_C == 0) {
                            ((kb) this).field_f.field_t = ((kb) this).field_f.field_t + 1;
                            if (((kb) this).field_f.field_t != 99) {
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
                          if (((kb) this).field_C == 1) {
                            ((kb) this).field_f.field_l = ((kb) this).field_f.field_l + 1;
                            if (((kb) this).field_f.field_l != 99) {
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
                          if (((kb) this).field_C == 2) {
                            ((kb) this).field_f.field_u = ((kb) this).field_f.field_u + 1;
                            if (((kb) this).field_f.field_u == 99) {
                              f.a(11, 244, (byte) -25);
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        if (((kb) this).field_C == 4) {
                          ((kb) this).field_f.field_p = ((kb) this).field_f.field_p + 1;
                          if (((kb) this).field_f.field_p != 99) {
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
                        if (null == ((kb) this).field_p) {
                          break L12;
                        } else {
                          L13: {
                            ((kb) this).field_p.field_d = ((kb) this).field_p.field_d + he.field_p[param1.field_y];
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
                            if (~var6 <= ~var5) {
                              break L12;
                            } else {
                              ((kb) this).field_f.field_b.a(-91, (ca) (Object) new oj(param1.field_u, param1.field_z, ((kb) this).field_p, var6));
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
                      ((kb) this).field_f.field_h.a(-99, (ca) (Object) new me((double)param1.field_u, (double)param1.field_z, 1));
                      break L11;
                    }
                    L15: {
                      L16: {
                        L17: {
                          if (((kb) this).field_f.field_x > 11) {
                            break L17;
                          } else {
                            if (((kb) this).field_f.field_m < 4) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ((kb) this).field_f.field_f.field_g[param1.field_u + ((kb) this).field_f.field_f.field_c * param1.field_z] = ((kb) this).field_f.field_f.field_g[param1.field_u + ((kb) this).field_f.field_f.field_c * param1.field_z] + 5;
                        var5 = 0;
                        L18: while (true) {
                          if (~((kb) this).field_D >= ~var5) {
                            break L16;
                          } else {
                            ((kb) this).field_f.field_f.field_v[((kb) this).field_i[var5]] = ((kb) this).field_f.field_f.field_v[((kb) this).field_i[var5]] + 1;
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
                        if (param1.field_y == 5) {
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
                                if (~var7 < ~(var5 + param1.field_z)) {
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
                                        if (~((kb) this).field_f.field_f.field_c >= ~var6) {
                                          break L25;
                                        } else {
                                          if (0 > var7) {
                                            break L25;
                                          } else {
                                            if (~((kb) this).field_f.field_f.field_t < ~var7) {
                                              ((kb) this).field_f.field_h.a(-107, (ca) (Object) new me((double)param1.field_u, (double)param1.field_z, 0.05 * (double)(var6 + -param1.field_u), 0.05 * (double)(-param1.field_z + var7), 1));
                                              var8 = ((kb) this).field_f.field_f.field_c * var7 + var6;
                                              if (((kb) this).field_f.field_f.field_o[var8] != 7) {
                                                break L25;
                                              } else {
                                                var9 = ((kb) this).field_f.a(var8, -66);
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var4 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) var4;
            stackOut_111_1 = new StringBuilder().append("kb.E(").append(param0).append(',');
            stackIn_114_0 = stackOut_111_0;
            stackIn_114_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param1 == null) {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L26;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_115_0 = stackOut_112_0;
              stackIn_115_1 = stackOut_112_1;
              stackIn_115_2 = stackOut_112_2;
              break L26;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_115_0, stackIn_115_2 + ',' + param2 + ')');
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
                ((kb) this).d(-12);
                break L1;
              }
            }
            var4_int = -param0 - -320;
            var5 = -param2 - -240;
            var6 = ((kb) this).field_k;
            L2: while (true) {
              L3: {
                L4: {
                  if (((kb) this).field_B == var6) {
                    break L4;
                  } else {
                    var7 = var4_int + (int)((float)ol.field_e * ((kb) this).field_r[var6].field_e);
                    var8 = (int)(((kb) this).field_r[var6].field_d * (float)ol.field_e) + var5;
                    var9 = var4_int + ((kb) this).field_r[var6].field_b * ol.field_e;
                    var10 = var5 + ol.field_e * ((kb) this).field_r[var6].field_g;
                    var11 = (-((kb) this).field_y + ((kb) this).field_r[var6].field_c) * 4;
                    ul.f(var7 - 1, var8, -1 + var9, var10, 11176191, var11);
                    ul.f(var7 + 1, var8, 1 + var9, var10, 11176191, var11);
                    ul.f(var7, -1 + var8, var9, -1 + var10, 11176191, var11);
                    ul.f(var7, 1 + var8, var9, 1 + var10, 11176191, var11);
                    ul.f(var7, var8, var9, var10, 16777215, var11);
                    var6 = (1 + var6) % ((kb) this).field_r.length;
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
          throw dd.a((Throwable) (Object) var4, "kb.K(" + param0 + ',' + param1 + ',' + param2 + ')');
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
              ((kb) this).field_y = ((kb) this).field_y + 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((kb) this).field_B == ((kb) this).field_k) {
                      break L3;
                    } else {
                      stackOut_5_0 = ~((kb) this).field_y;
                      stackOut_5_1 = ~((kb) this).field_r[((kb) this).field_k].field_c;
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
                          ((kb) this).field_k = (((kb) this).field_k - -1) % ((kb) this).field_r.length;
                          if (var8 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = ~((kb) this).field_k;
                  stackOut_12_1 = ~((kb) this).field_B;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == stackIn_13_1) {
                    break L4;
                  } else {
                    var2_int = ((kb) this).field_y + 59;
                    var3 = ((kb) this).field_B;
                    L5: while (true) {
                      L6: {
                        var3--;
                        if (0 <= var3) {
                          break L6;
                        } else {
                          var3 = -1 + ((kb) this).field_r.length;
                          break L6;
                        }
                      }
                      if (~((kb) this).field_r[var3].field_c != ~var2_int) {
                        break L4;
                      } else {
                        var4 = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 117);
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (null == var4) {
                                break L9;
                              } else {
                                stackOut_20_0 = -1;
                                stackOut_20_1 = ~var4.field_f;
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
                                        var5 = ((kb) this).field_r[var3].field_b + -var4.field_u;
                                        var6 = ((kb) this).field_r[var3].field_g + -var4.field_z;
                                        if (Math.abs(var5) >= 4) {
                                          break L10;
                                        } else {
                                          if (Math.abs(var6) < 4) {
                                            if (!this.a(var4.field_u, (float)((kb) this).field_r[var3].field_b, 71, var4.field_z, (float)((kb) this).field_r[var3].field_g)) {
                                              break L10;
                                            } else {
                                              L11: {
                                                var4.field_f = 60;
                                                if (var4.field_y == 7) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    L13: {
                                                      var7 = 5;
                                                      if (((kb) this).field_F != 1) {
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
                                                      if (((kb) this).field_F != 2) {
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
                                                      if (3 != ((kb) this).field_F) {
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
                                                    if (((kb) this).field_F == 4) {
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
                                  var4 = (pd) (Object) ((kb) this).field_f.field_r.d(param0 ^ 857);
                                  if (var8 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            stackOut_57_0 = ~((kb) this).field_k;
                            stackOut_57_1 = ~var3;
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
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "kb.G(" + param0 + ')');
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
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -((kb) this).field_o + ((kb) this).field_q;
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
                if (((kb) this).field_C != 5) {
                  break L4;
                } else {
                  ((kb) this).field_o = ((kb) this).field_o + (-(5 * ((kb) this).field_t) + 2500);
                  if (var7 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((kb) this).field_o = ((kb) this).field_o + var2_int / 10;
              break L3;
            }
            L5: {
              if (((kb) this).field_o <= 32768) {
                break L5;
              } else {
                ((kb) this).field_o = ((kb) this).field_o - 65536;
                break L5;
              }
            }
            L6: {
              if (-32768 <= ((kb) this).field_o) {
                break L6;
              } else {
                ((kb) this).field_o = ((kb) this).field_o + 65536;
                break L6;
              }
            }
            L7: {
              L8: {
                if (((kb) this).field_C == 1) {
                  break L8;
                } else {
                  if (2 == ((kb) this).field_C) {
                    break L8;
                  } else {
                    if (((kb) this).field_C != 4) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              ((kb) this).field_o = ((kb) this).field_q;
              break L7;
            }
            if (param0 > 120) {
              L9: {
                if (!((kb) this).field_z) {
                  break L9;
                } else {
                  L10: {
                    if (((kb) this).field_C == 0) {
                      ((kb) this).field_A = ((kb) this).field_E.field_z;
                      ((kb) this).field_x = ((kb) this).field_E.field_u;
                      if (((kb) this).field_t <= 5) {
                        break L10;
                      } else {
                        if (((kb) this).field_t >= 25) {
                          break L10;
                        } else {
                          L11: {
                            var3 = Math.abs(-((kb) this).field_x + ((kb) this).field_g) - -Math.abs(-((kb) this).field_A + ((kb) this).field_h);
                            if (var3 <= 20) {
                              break L11;
                            } else {
                              var3 = 20;
                              break L11;
                            }
                          }
                          L12: {
                            if (var3 < 1) {
                              var3 = 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          if (((kb) this).field_t >= 5 + var3) {
                            break L10;
                          } else {
                            ((kb) this).field_f.field_h.a(-114, (ca) (Object) new me((double)((kb) this).field_x + (-5.0 + (double)((kb) this).field_t) * (double)(((kb) this).field_g - ((kb) this).field_x) / (double)var3, (double)(-((kb) this).field_A + ((kb) this).field_h) * ((double)((kb) this).field_t - 5.0) / (double)var3 + (double)((kb) this).field_A, 6));
                            break L10;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  L13: {
                    if (((kb) this).field_C == 3) {
                      if (((kb) this).field_t <= -45 + ((kb) this).field_n) {
                        break L13;
                      } else {
                        if (~((kb) this).field_n < ~((kb) this).field_t) {
                          L14: {
                            var3 = Math.abs(((kb) this).field_g - ((kb) this).field_x) - -Math.abs(-((kb) this).field_A + ((kb) this).field_h);
                            if (var3 > 40) {
                              var3 = 40;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (var3 >= 1) {
                              break L15;
                            } else {
                              var3 = 1;
                              break L15;
                            }
                          }
                          if (-45 + (((kb) this).field_n - -var3) > ((kb) this).field_t) {
                            ((kb) this).field_f.field_h.a(-90, (ca) (Object) new me((double)((kb) this).field_x + (double)(-((kb) this).field_x + ((kb) this).field_g) * ((double)((kb) this).field_t - ((double)((kb) this).field_n - 45.0)) / (double)var3, (double)((kb) this).field_A + (double)(-((kb) this).field_A + ((kb) this).field_h) * (45.0 - (double)((kb) this).field_n + (double)((kb) this).field_t) / (double)var3, 8));
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
                  if (2 != ((kb) this).field_C) {
                    break L9;
                  } else {
                    L16: {
                      if (((kb) this).field_t != 50) {
                        break L16;
                      } else {
                        var3_double = 0.0;
                        L17: while (true) {
                          if (6.283185307179586 <= var3_double) {
                            break L16;
                          } else {
                            ((kb) this).field_f.field_h.a(-82, (ca) (Object) new me((double)((kb) this).field_x + Math.random() - 0.5, (double)((kb) this).field_A + Math.random() - 0.5, 0.05 * Math.sin(var3_double), Math.cos(var3_double) * 0.05, 1));
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
                    if (((kb) this).field_t <= 50) {
                      break L9;
                    } else {
                      if (((kb) this).field_t < 100) {
                        L18: {
                          var3 = (Math.abs(-((kb) this).field_x + ((kb) this).field_g) - -Math.abs(-((kb) this).field_A + ((kb) this).field_h)) * 5;
                          if (var3 > 50) {
                            var3 = 50;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (var3 < 1) {
                            var3 = 1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        if (~((kb) this).field_t <= ~(var3 + 50)) {
                          break L9;
                        } else {
                          var4 = var3 / 2;
                          var5 = ((kb) this).field_t - (var4 + 50);
                          var6 = (int)(0.5 * Math.sqrt((double)(-(var5 * var5) + var4 * var4)));
                          ((kb) this).field_f.field_h.a(-119, (ca) (Object) new me((double)((kb) this).field_x + (double)(-((kb) this).field_x + ((kb) this).field_g) * ((double)((kb) this).field_t - 50.0) / (double)var3, (double)(-var6) + ((double)(-((kb) this).field_A + ((kb) this).field_h) * ((double)((kb) this).field_t - 50.0) / (double)var3 + (double)((kb) this).field_A), 4));
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "kb.H(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
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
        var15 = OrbDefence.field_D ? 1 : 0;
        if (-1 == ((kb) this).field_C) {
          return;
        } else {
          L0: {
            if (param2 == -8) {
              break L0;
            } else {
              this.b((byte) -4);
              break L0;
            }
          }
          L1: {
            var4_int = 320 + -param0 + ((kb) this).field_g * ol.field_e;
            var5 = 240 + (-param1 + ((kb) this).field_h * ol.field_e);
            ((kb) this).field_u = 320.0 / (double)(320 + Math.abs(-320 + var4_int));
            if (!((kb) this).field_z) {
              break L1;
            } else {
              L2: {
                L3: {
                  var6 = 320 + (ol.field_e * ((kb) this).field_x + -param0);
                  var7 = 240 + -param1 + ol.field_e * ((kb) this).field_A;
                  var10 = ((kb) this).field_C;
                  if (var10 != 1) {
                    break L3;
                  } else {
                    if (var15 == 0) {
                      if (~((kb) this).field_t < ~(((kb) this).field_n - 20)) {
                        var10 = ol.field_e / 2 + var4_int;
                        var11 = -8 + (var5 + ol.field_e / 2);
                        ul.f(var6 + -1, var7, -1 + var10, var11, 11176191, -(10 * (((kb) this).field_n - ((kb) this).field_t)) + 200);
                        ul.f(var6 - -1, var7, 1 + var10, var11, 11176191, -(10 * (-((kb) this).field_t + ((kb) this).field_n)) + 200);
                        ul.f(var6, -1 + var7, var10, var11 + -1, 11176191, 200 + -((-((kb) this).field_t + ((kb) this).field_n) * 10));
                        ul.f(var6, 1 + var7, var10, 1 + var11, 11176191, 200 + -(10 * (-((kb) this).field_t + ((kb) this).field_n)));
                        ul.f(var6, var7, var10, var11, 16777215, 200 - 10 * (((kb) this).field_n + -((kb) this).field_t));
                        if (var15 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (var10 == 4) {
                  break L2;
                } else {
                  break L1;
                }
              }
              L4: {
                var9 = -12 + (ol.field_e + var5);
                var8 = var4_int - -ol.field_e;
                if (5 < ((kb) this).field_t) {
                  break L4;
                } else {
                  if (((kb) this).field_E == null) {
                    break L4;
                  } else {
                    if (-((kb) this).field_E.field_h + ((kb) this).field_E.field_o <= 0) {
                      break L4;
                    } else {
                      ul.f(var6 + -1, var7, var8 - 1, var9, 16776960, 200 - (-((kb) this).field_t + ((kb) this).field_n) * 10);
                      ul.f(1 + var6, var7, var8 + 1, var9, 16776960, -((-((kb) this).field_t + ((kb) this).field_n) * 10) + 200);
                      ul.f(var6, -1 + var7, var8, -1 + var9, 16776960, 200 - (((kb) this).field_n - ((kb) this).field_t) * 10);
                      ul.f(var6, var7 - -1, var8, 1 + var9, 16776960, 200 + -((((kb) this).field_n - ((kb) this).field_t) * 10));
                      ul.f(var6, var7, var8, var9, 16777215, 200 - (-((kb) this).field_t + ((kb) this).field_n) * 10);
                      if (var15 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              if (50 < ((kb) this).field_t) {
                break L1;
              } else {
                if (((kb) this).field_E == null) {
                  break L1;
                } else {
                  if (((kb) this).field_E.field_o - ((kb) this).field_E.field_h > 0) {
                    ((kb) this).field_x = ((kb) this).field_E.field_u;
                    ((kb) this).field_A = ((kb) this).field_E.field_z;
                    ul.f(-1 + var6, var7, -1 + var8, var9, 16776960, 250 + -(5 * ((kb) this).field_t));
                    ul.f(var6 + 1, var7, 1 + var8, var9, 16776960, 250 + -(((kb) this).field_t * 5));
                    ul.f(var6, var7 - 1, var8, var9 - 1, 16776960, 5 * (-((kb) this).field_t + 50));
                    ul.f(var6, 1 + var7, var8, var9 - -1, 16776960, (-((kb) this).field_t + 50) * 5);
                    ul.f(var6, var7, var8, var9, 16777215, 5 * (50 - ((kb) this).field_t));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L5: {
            L6: {
              if (((kb) this).field_C == 0) {
                break L6;
              } else {
                L7: {
                  if (((kb) this).field_C != 1) {
                    break L7;
                  } else {
                    L8: {
                      var5 = var5 + ol.field_e / 2;
                      var4_int = var4_int + ol.field_e / 2;
                      hf.field_g[((kb) this).field_C * 7].a(var4_int, -5 + var5, 0, 1950);
                      var6 = 32;
                      if (((kb) this).field_F != 0) {
                        break L8;
                      } else {
                        var6 = 24;
                        break L8;
                      }
                    }
                    L9: {
                      if (((kb) this).field_F != 1) {
                        break L9;
                      } else {
                        var6 = 24;
                        break L9;
                      }
                    }
                    L10: {
                      if (((kb) this).field_F == 2) {
                        var6 = 24;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (3 == ((kb) this).field_F) {
                        var6 = 24;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (((kb) this).field_F == 4) {
                        var6 = 24;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    hf.field_g[((kb) this).field_C * 7 + ((kb) this).field_F + 2].a(528, var6 << 4, var4_int << 4, var5 + -8 << 4, 32768 + ((kb) this).field_o, 1950);
                    hf.field_g[1 - -(7 * ((kb) this).field_C)].a(var4_int, var5 - 5, 0, 1950);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                L13: {
                  if (2 != ((kb) this).field_C) {
                    break L13;
                  } else {
                    L14: {
                      var4_int = var4_int + ol.field_e / 2;
                      var5 = var5 + ol.field_e / 2;
                      hf.field_g[0 - -(7 * ((kb) this).field_C)].a(var4_int, var5 - 5, 0, 1950);
                      var6 = 32;
                      if (((kb) this).field_F != 0) {
                        break L14;
                      } else {
                        var6 = 24;
                        break L14;
                      }
                    }
                    L15: {
                      if (((kb) this).field_F != 1) {
                        break L15;
                      } else {
                        var6 = 24;
                        break L15;
                      }
                    }
                    L16: {
                      if (((kb) this).field_F == 2) {
                        var6 = 24;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (((kb) this).field_F == 3) {
                        var6 = 24;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (((kb) this).field_F != 4) {
                        break L18;
                      } else {
                        var6 = 24;
                        break L18;
                      }
                    }
                    hf.field_g[((kb) this).field_F + (2 - -(7 * ((kb) this).field_C))].a(528, var6 << 4, var4_int << 4, var5 - 12 << 4, ((kb) this).field_o - -32768, 1950);
                    hf.field_g[7 * ((kb) this).field_C + 1].a(var4_int, -8 + var5, 0, 1950);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L13;
                    }
                  }
                }
                L19: {
                  if (((kb) this).field_C == 5) {
                    break L19;
                  } else {
                    L20: {
                      if (((kb) this).field_C != 6) {
                        break L20;
                      } else {
                        hf.field_g[7 * ((kb) this).field_C].a(var4_int, var5 - 5, 0, 1300);
                        if (((kb) this).field_s == null) {
                          break L5;
                        } else {
                          if (((kb) this).field_s.field_C != -1) {
                            L21: {
                              var6 = var4_int;
                              var7 = -10 + var5;
                              var8 = 320 + ((kb) this).field_s.field_g * ol.field_e - param0;
                              var9 = -10 + (-param1 + (((kb) this).field_s.field_h * ol.field_e - -240));
                              var10 = 200 * ((kb) this).field_j / 100;
                              if (((kb) this).field_s.field_t <= -10) {
                                break L21;
                              } else {
                                L22: {
                                  var10 = 20 * -((kb) this).field_s.field_t;
                                  var11 = var6 + -var8;
                                  var12 = var7 - var9;
                                  if (var11 != 0) {
                                    break L22;
                                  } else {
                                    if (var12 == 0) {
                                      break L21;
                                    } else {
                                      var7 = var9 + var12 * -((kb) this).field_s.field_t / 10;
                                      if (var15 == 0) {
                                        break L21;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                                var6 = var8 - -(-((kb) this).field_s.field_t * var11 / 10);
                                break L21;
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
                              break L5;
                            } else {
                              break L20;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L23: {
                      if (((kb) this).field_C != 3) {
                        break L23;
                      } else {
                        L24: {
                          hf.field_g[7 * ((kb) this).field_C].a(var4_int, -5 + var5, 0, 1300);
                          var6 = 32;
                          if (0 == ((kb) this).field_F) {
                            var6 = 24;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          if (((kb) this).field_F == 1) {
                            var6 = 24;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (((kb) this).field_F == 2) {
                            var6 = 24;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if (((kb) this).field_F == 3) {
                            var6 = 24;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (((kb) this).field_F == 4) {
                            var6 = 24;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        hf.field_g[7 * ((kb) this).field_C + (((kb) this).field_F + 2)].a(528, var6 << 4, var4_int << 4, -12 + var5 << 4, ((kb) this).field_o - -32768, 1800);
                        hf.field_g[1 - -(7 * ((kb) this).field_C)].a(var4_int, var5 - 10, 0, 1300);
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (4 != ((kb) this).field_C) {
                      break L5;
                    } else {
                      L29: {
                        var4_int = var4_int + ol.field_e;
                        var5 = var5 + ol.field_e;
                        hf.field_g[0 - -(((kb) this).field_C * 7)].a(var4_int, var5 + -5, 0, 2600);
                        var6 = 32;
                        if (((kb) this).field_F != 0) {
                          break L29;
                        } else {
                          var6 = 16;
                          break L29;
                        }
                      }
                      L30: {
                        if (1 == ((kb) this).field_F) {
                          var6 = 16;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (((kb) this).field_F == 2) {
                          var6 = 16;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L32: {
                        if (((kb) this).field_F != 3) {
                          break L32;
                        } else {
                          var6 = 16;
                          break L32;
                        }
                      }
                      L33: {
                        if (4 != ((kb) this).field_F) {
                          break L33;
                        } else {
                          var6 = 16;
                          break L33;
                        }
                      }
                      hf.field_g[7 * ((kb) this).field_C + (((kb) this).field_F + 2)].a(528, var6 << 4, var4_int << 4, var5 - 12 << 4, 32768 + ((kb) this).field_o, 2600);
                      hf.field_g[((kb) this).field_C * 7 + 1].a(var4_int, var5 + -8, 0, 2600);
                      if (var15 == 0) {
                        break L5;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                L34: {
                  var4_int = var4_int + ol.field_e / 2;
                  var5 = var5 + ol.field_e / 2;
                  var6 = 1950;
                  hf.field_g[7 * ((kb) this).field_C].a(var4_int, -5 + var5, 0, var6);
                  var7_ref_hj = hf.field_g[2 - -((kb) this).field_F + ((kb) this).field_C * 7];
                  var7_ref_hj.a(var7_ref_hj.field_s << 3, var7_ref_hj.field_t << 3, var4_int << 4, -12 + var5 << 4, 32768 + ((kb) this).field_o, var6);
                  hf.field_g[((kb) this).field_C * 7 + 1].a(var4_int, var5 - 8, 0, var6);
                  if (((kb) this).field_t <= 5) {
                    var8 = ((kb) this).field_f.field_i % 9000;
                    var9 = var6 * hf.field_g[7 * ((kb) this).field_C].field_o >> 12;
                    var10 = hf.field_g[((kb) this).field_C * 7].field_k * var6 >> 12;
                    var11 = (((kb) this).field_g * ((kb) this).field_g + var8) % var9 + var4_int + -(var9 >> 1);
                    var12 = (((kb) this).field_h * ((kb) this).field_g + var8) % var10 - -var5 - (var10 >> 1);
                    var13 = -(var9 >> 1) - (-var4_int - (var8 * var8 + ((kb) this).field_g) % var9);
                    var14 = var8 * var8 % var10 - -var5 + -(var10 >> 1);
                    ul.f(var11, var12, var13, var14, 16777215, 200);
                    break L34;
                  } else {
                    break L34;
                  }
                }
                if (var15 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L35: {
              hf.field_g[0 - -(((kb) this).field_C * 7)].a(var4_int, var5 - 5, 0, 1300);
              var6 = 32;
              if (((kb) this).field_F == 0) {
                var6 = 32;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (((kb) this).field_F == 1) {
                var6 = 32;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (((kb) this).field_F != 2) {
                break L37;
              } else {
                var6 = 24;
                break L37;
              }
            }
            L38: {
              if (((kb) this).field_F != 3) {
                break L38;
              } else {
                var6 = 24;
                break L38;
              }
            }
            L39: {
              if (((kb) this).field_F == 4) {
                var6 = 24;
                break L39;
              } else {
                break L39;
              }
            }
            hf.field_g[7 * ((kb) this).field_C + (2 - -((kb) this).field_F)].a(528, var6 << 4, var4_int << 4, var5 + -8 << 4, 32768 + ((kb) this).field_o, 1300);
            hf.field_g[1 + 7 * ((kb) this).field_C].a(var4_int, -6 + var5, 0, 1300);
            break L5;
          }
          L40: {
            if (null == ((kb) this).field_p) {
              break L40;
            } else {
              L41: {
                var6 = 0;
                if (((kb) this).field_p.field_i != 0) {
                  break L41;
                } else {
                  var6 = 16711680;
                  break L41;
                }
              }
              L42: {
                if (((kb) this).field_p.field_i != 1) {
                  break L42;
                } else {
                  var6 = 65280;
                  break L42;
                }
              }
              L43: {
                if (((kb) this).field_p.field_i != 2) {
                  break L43;
                } else {
                  var6 = 255;
                  break L43;
                }
              }
              L44: {
                if (3 != ((kb) this).field_p.field_i) {
                  break L44;
                } else {
                  var6 = 16776960;
                  break L44;
                }
              }
              L45: {
                var5 -= 15;
                if (((kb) this).field_F <= 0) {
                  break L45;
                } else {
                  L46: {
                    var6 = 16777215;
                    if (1 == ((kb) this).field_F) {
                      var6 = 255;
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  L47: {
                    if (((kb) this).field_F != 2) {
                      break L47;
                    } else {
                      var6 = 8913151;
                      break L47;
                    }
                  }
                  L48: {
                    if (((kb) this).field_F == 3) {
                      var6 = 16746751;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    if (((kb) this).field_F == 4) {
                      var6 = 16777215;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  L50: {
                    var7 = 4;
                    ul.i(var4_int, var5, var7, var6, 128);
                    if (ol.field_e >> 2 <= 2) {
                      break L50;
                    } else {
                      ul.i(var4_int, var5, -1 + var7, var6, 128);
                      break L50;
                    }
                  }
                  L51: {
                    if (ol.field_e >> 2 <= 3) {
                      break L51;
                    } else {
                      ul.i(var4_int, var5, -2 + var7, var6, 128);
                      break L51;
                    }
                  }
                  ul.g(var4_int, var5, var7, 0);
                  break L45;
                }
              }
              L52: {
                if (((kb) this).field_F >= 4) {
                  break L52;
                } else {
                  if (ui.field_a[((kb) this).field_C][((kb) this).field_F - -1] > ((kb) this).field_f.field_e[0].b(true)) {
                    break L52;
                  } else {
                    if (((kb) this).field_F >= jk.field_j[((kb) this).field_C]) {
                      break L52;
                    } else {
                      var7 = 64 + (int)(Math.sin((double)ji.b(param2 ^ 91) * 0.01 + (double)((kb) this).field_g + (double)((kb) this).field_h) * 48.0);
                      var6 = 16777215;
                      ul.a(var4_int << 4, var5 << 4, var7, 255, ki.field_f);
                      break L52;
                    }
                  }
                }
              }
              var5 += 15;
              break L40;
            }
          }
          L53: {
            if (((kb) this).field_v >= 50) {
              break L53;
            } else {
              if (((kb) this).field_t <= 2) {
                L54: {
                  L55: {
                    var6 = 16776960;
                    if ((((kb) this).field_h & 1) > 0) {
                      break L55;
                    } else {
                      var4_int++;
                      if (var15 == 0) {
                        break L54;
                      } else {
                        break L55;
                      }
                    }
                  }
                  var4_int--;
                  break L54;
                }
                L56: {
                  if (((kb) this).field_v <= 0) {
                    var6 = 16711680;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                ul.h(-1 + var4_int, -5 + var5, 4, 11, 0);
                ul.h(var4_int, var5 + -4, 2, 4, var6);
                ul.h(var4_int, var5 - -3, 2, 2, var6);
                break L53;
              } else {
                break L53;
              }
            }
          }
          return;
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        Object var2 = null;
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
        int stackIn_14_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_31_0 = 0;
        kb stackIn_47_0 = null;
        Object stackIn_47_1 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_172_0 = 0;
        int stackIn_172_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        kb stackIn_181_0 = null;
        Object stackIn_181_1 = null;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_247_0 = 0;
        int stackIn_247_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_256_1 = 0;
        int stackIn_272_0 = 0;
        int stackIn_272_1 = 0;
        int stackIn_282_0 = 0;
        int stackIn_282_1 = 0;
        int stackIn_283_0 = 0;
        int stackIn_283_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_30_0 = 0;
        kb stackOut_46_0 = null;
        Object stackOut_46_1 = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_171_0 = 0;
        int stackOut_171_1 = 0;
        int stackOut_177_0 = 0;
        int stackOut_177_1 = 0;
        Object stackOut_180_0 = null;
        Object stackOut_180_1 = null;
        int stackOut_246_0 = 0;
        int stackOut_246_1 = 0;
        int stackOut_255_0 = 0;
        int stackOut_255_1 = 0;
        int stackOut_271_0 = 0;
        int stackOut_271_1 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        int stackOut_281_0 = 0;
        int stackOut_281_1 = 0;
        int stackOut_282_0 = 0;
        int stackOut_282_1 = 0;
        L0: {
          var10 = OrbDefence.field_D ? 1 : 0;
          if (param0 == 89) {
            break L0;
          } else {
            ((kb) this).a(59, (byte) -37, 78);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != ((kb) this).field_p) {
              break L2;
            } else {
              ((kb) this).field_v = 200;
              if (var10 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var2_int = ((kb) this).field_p.field_j - ((kb) this).field_g;
          var3 = -((kb) this).field_h + ((kb) this).field_p.field_c;
          if (var2_int * var2_int - -(var3 * var3) > 100) {
            break L1;
          } else {
            ((kb) this).field_v = 200;
            break L1;
          }
        }
        L3: {
          L4: {
            ((kb) this).field_v = 200;
            if (6 != ((kb) this).field_C) {
              break L4;
            } else {
              if (null == ((kb) this).field_s) {
                break L4;
              } else {
                L5: {
                  if (((kb) this).field_j <= 0) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L5;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var2_int = stackIn_14_0;
                    var3 = 0;
                    var4 = ((kb) this).field_s.field_w;
                    var5 = 1;
                    if (~((kb) this).field_g < ~((kb) this).field_s.field_g) {
                      break L7;
                    } else {
                      L8: {
                        if (~((kb) this).field_h <= ~((kb) this).field_s.field_h) {
                          break L8;
                        } else {
                          var5 = ((kb) this).field_f.field_f.field_c;
                          if (var10 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (~((kb) this).field_s.field_h > ~((kb) this).field_h) {
                        var5 = -((kb) this).field_f.field_f.field_c;
                        if (var10 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5 = -1;
                  break L6;
                }
                var6 = ((kb) this).field_w;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (~var6 == ~var4) {
                        break L11;
                      } else {
                        ((kb) this).field_f.field_f.field_e[var6] = var2_int != 0;
                        stackOut_25_0 = ((kb) this).field_f.field_f.field_m[var6];
                        stackIn_31_0 = stackOut_25_0 ? 1 : 0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var10 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (!stackIn_26_0) {
                              break L12;
                            } else {
                              var3++;
                              break L12;
                            }
                          }
                          var6 = var6 + var5;
                          if (var10 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = ~var3;
                    stackIn_31_0 = stackOut_30_0;
                    break L10;
                  }
                  L13: {
                    if (stackIn_31_0 < -1) {
                      break L13;
                    } else {
                      if (((kb) this).field_j < 100) {
                        ((kb) this).field_j = ((kb) this).field_j + 1;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L13;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((kb) this).field_j = ((kb) this).field_j - var3;
                  if (((kb) this).field_j > 0) {
                    break L4;
                  } else {
                    var6 = ((kb) this).field_w;
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (var4 == var6) {
                            break L16;
                          } else {
                            ((kb) this).field_f.field_f.field_e[var6] = false;
                            var6 = var6 + var5;
                            if (var10 != 0) {
                              break L15;
                            } else {
                              if (var10 == 0) {
                                continue L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        ((kb) this).field_f.a(3, ((kb) this).field_g, (byte) -38, ((kb) this).field_h);
                        hf discarded$3 = ea.a(113, mh.field_a[59], (int)(96.0 * ((kb) this).field_u));
                        ((kb) this).d(9);
                        ((kb) this).field_C = -1;
                        break L15;
                      }
                      var6_ref_km = new km(((kb) this).field_f.field_o);
                      var7 = 0;
                      var8_ref_kb = (kb) (Object) var6_ref_km.d(27935);
                      L17: while (true) {
                        L18: {
                          if (var8_ref_kb == null) {
                            break L18;
                          } else {
                            stackOut_46_0 = (kb) var8_ref_kb;
                            stackOut_46_1 = this;
                            stackIn_181_0 = stackOut_46_0;
                            stackIn_181_1 = stackOut_46_1;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            if (var10 != 0) {
                              break L3;
                            } else {
                              L19: {
                                if ((Object) (Object) stackIn_47_0 == this) {
                                  break L19;
                                } else {
                                  if (var8_ref_kb.field_s != ((kb) this).field_s) {
                                    break L19;
                                  } else {
                                    var7 = 1;
                                    if (var10 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var8_ref_kb = (kb) (Object) var6_ref_km.b(true);
                              if (var10 == 0) {
                                continue L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        if (var7 == 0) {
                          ((kb) this).field_f.a(3, ((kb) this).field_s.field_g, (byte) -38, ((kb) this).field_s.field_h);
                          ((kb) this).field_s.d(9);
                          ((kb) this).field_s.field_C = -1;
                          break L4;
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
          L20: {
            L21: {
              if (((kb) this).field_z) {
                L22: {
                  if (((kb) this).field_C == 0) {
                    if (((kb) this).field_t != 5) {
                      break L22;
                    } else {
                      L23: {
                        var2_int = 5;
                        if (((kb) this).field_F < 1) {
                          break L23;
                        } else {
                          var2_int = 10;
                          break L23;
                        }
                      }
                      L24: {
                        if (3 <= ((kb) this).field_F) {
                          var2_int = 20;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (((kb) this).field_E == null) {
                          break L25;
                        } else {
                          if (((kb) this).field_E.field_y == 4) {
                            break L25;
                          } else {
                            var2_int = var2_int - ((kb) this).field_F;
                            break L25;
                          }
                        }
                      }
                      this.a(var2_int, ((kb) this).field_E, 79);
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L26: {
                  L27: {
                    if (3 == ((kb) this).field_C) {
                      if (((kb) this).field_t == ((kb) this).field_n - 45) {
                        ((kb) this).field_f.field_h.a(-109, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, 9));
                        var2_int = 2 + ((kb) this).field_F;
                        var3 = ((kb) this).field_F * 2 + 2;
                        var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) -15);
                        L28: while (true) {
                          if (var4_ref_pd == null) {
                            break L27;
                          } else {
                            var5 = -var4_ref_pd.field_u + ((kb) this).field_x;
                            var6 = ((kb) this).field_A + -var4_ref_pd.field_z;
                            stackOut_77_0 = -1;
                            stackOut_77_1 = ~(var4_ref_pd.field_o - var4_ref_pd.field_h);
                            stackIn_90_0 = stackOut_77_0;
                            stackIn_90_1 = stackOut_77_1;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            if (var10 != 0) {
                              break L26;
                            } else {
                              L29: {
                                if (stackIn_78_0 <= stackIn_78_1) {
                                  break L29;
                                } else {
                                  if (~var2_int > ~Math.abs(var5)) {
                                    break L29;
                                  } else {
                                    if (Math.abs(var6) > var2_int) {
                                      break L29;
                                    } else {
                                      this.a(var3, var4_ref_pd, 45);
                                      if (50 * (((kb) this).field_F + 1) > var4_ref_pd.field_i) {
                                        var4_ref_pd.field_i = 50 * (((kb) this).field_F + 1);
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                              }
                              var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                              if (var10 == 0) {
                                continue L28;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                      } else {
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  stackOut_89_0 = 1;
                  stackOut_89_1 = ((kb) this).field_C;
                  stackIn_90_0 = stackOut_89_0;
                  stackIn_90_1 = stackOut_89_1;
                  break L26;
                }
                L30: {
                  L31: {
                    if (stackIn_90_0 != stackIn_90_1) {
                      break L31;
                    } else {
                      L32: {
                        L33: {
                          if (((kb) this).field_n - 7 != ((kb) this).field_t) {
                            break L33;
                          } else {
                            var2_int = 2;
                            var3 = 1;
                            var4 = 0;
                            var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) -82);
                            L34: while (true) {
                              if (var5_ref_pd == null) {
                                break L33;
                              } else {
                                var6 = ((kb) this).field_A + -var5_ref_pd.field_z;
                                var7 = -var5_ref_pd.field_u + ((kb) this).field_x;
                                stackOut_95_0 = 7;
                                stackOut_95_1 = var5_ref_pd.field_y;
                                stackIn_117_0 = stackOut_95_0;
                                stackIn_117_1 = stackOut_95_1;
                                stackIn_96_0 = stackOut_95_0;
                                stackIn_96_1 = stackOut_95_1;
                                if (var10 != 0) {
                                  break L32;
                                } else {
                                  L35: {
                                    if (stackIn_96_0 == stackIn_96_1) {
                                      break L35;
                                    } else {
                                      if (var4 >= 10) {
                                        break L35;
                                      } else {
                                        if (var5_ref_pd.field_o + -var5_ref_pd.field_h <= 0) {
                                          break L35;
                                        } else {
                                          if (~var2_int > ~Math.abs(var6)) {
                                            break L35;
                                          } else {
                                            if (var2_int >= Math.abs(var7)) {
                                              var8 = var5_ref_pd.field_t;
                                              var9 = 0;
                                              L36: while (true) {
                                                if (~var9 <= ~((kb) this).field_D) {
                                                  break L35;
                                                } else {
                                                  stackOut_109_0 = ~((kb) this).field_i[var9];
                                                  stackOut_109_1 = ~var8;
                                                  stackIn_117_0 = stackOut_109_0;
                                                  stackIn_117_1 = stackOut_109_1;
                                                  stackIn_110_0 = stackOut_109_0;
                                                  stackIn_110_1 = stackOut_109_1;
                                                  if (var10 != 0) {
                                                    break L32;
                                                  } else {
                                                    L37: {
                                                      if (stackIn_110_0 == stackIn_110_1) {
                                                        this.a(var3, var5_ref_pd, param0 ^ 127);
                                                        ((kb) this).field_f.field_h.a(-69, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, 0.1 * ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)((kb) this).field_x), ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)((kb) this).field_A) * 0.1, 7));
                                                        var4++;
                                                        break L37;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                    var9++;
                                                    if (var10 == 0) {
                                                      continue L36;
                                                    } else {
                                                      break L35;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                                  if (var10 == 0) {
                                    continue L34;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_116_0 = ~((kb) this).field_t;
                        stackOut_116_1 = ~(((kb) this).field_n + -15);
                        stackIn_117_0 = stackOut_116_0;
                        stackIn_117_1 = stackOut_116_1;
                        break L32;
                      }
                      if (stackIn_117_0 == stackIn_117_1) {
                        var2_int = 4;
                        var3 = 1;
                        var4 = 0;
                        var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) -12);
                        L38: while (true) {
                          if (null == var5_ref_pd) {
                            break L31;
                          } else {
                            var6 = -var5_ref_pd.field_z + ((kb) this).field_A;
                            var7 = -var5_ref_pd.field_u + ((kb) this).field_x;
                            stackOut_121_0 = -8;
                            stackOut_121_1 = ~var5_ref_pd.field_y;
                            stackIn_142_0 = stackOut_121_0;
                            stackIn_142_1 = stackOut_121_1;
                            stackIn_122_0 = stackOut_121_0;
                            stackIn_122_1 = stackOut_121_1;
                            if (var10 != 0) {
                              break L30;
                            } else {
                              L39: {
                                if (stackIn_122_0 == stackIn_122_1) {
                                  break L39;
                                } else {
                                  if (var4 >= 6) {
                                    break L39;
                                  } else {
                                    if (-var5_ref_pd.field_h + var5_ref_pd.field_o <= 0) {
                                      break L39;
                                    } else {
                                      if (var2_int < Math.abs(var6)) {
                                        break L39;
                                      } else {
                                        if (var2_int < Math.abs(var7)) {
                                          break L39;
                                        } else {
                                          var8 = var5_ref_pd.field_t;
                                          var9 = 0;
                                          L40: while (true) {
                                            if (~var9 <= ~((kb) this).field_D) {
                                              break L39;
                                            } else {
                                              stackOut_134_0 = var8;
                                              stackOut_134_1 = ((kb) this).field_i[var9];
                                              stackIn_142_0 = stackOut_134_0;
                                              stackIn_142_1 = stackOut_134_1;
                                              stackIn_135_0 = stackOut_134_0;
                                              stackIn_135_1 = stackOut_134_1;
                                              if (var10 != 0) {
                                                break L30;
                                              } else {
                                                L41: {
                                                  if (stackIn_135_0 == stackIn_135_1) {
                                                    this.a(var3, var5_ref_pd, 73);
                                                    ((kb) this).field_f.field_h.a(param0 + -163, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, ((double)var5_ref_pd.field_u + Math.random() - 0.5 - (double)((kb) this).field_x) * 0.1, 0.1 * ((double)var5_ref_pd.field_z + Math.random() - 0.5 - (double)((kb) this).field_A), 7));
                                                    var4++;
                                                    break L41;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                                var9++;
                                                if (var10 == 0) {
                                                  continue L40;
                                                } else {
                                                  break L39;
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
                              var5_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                              if (var10 == 0) {
                                continue L38;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                  }
                  stackOut_141_0 = ~((kb) this).field_C;
                  stackOut_141_1 = -3;
                  stackIn_142_0 = stackOut_141_0;
                  stackIn_142_1 = stackOut_141_1;
                  break L30;
                }
                if (stackIn_142_0 != stackIn_142_1) {
                  break L21;
                } else {
                  if (((kb) this).field_t == 50) {
                    L42: {
                      ((kb) this).field_v = ((kb) this).field_v - 4;
                      var2_int = 2;
                      var3 = 30;
                      if (((kb) this).field_F < 1) {
                        break L42;
                      } else {
                        var3 = 44;
                        var2_int = 2;
                        break L42;
                      }
                    }
                    L43: {
                      if (((kb) this).field_F < 2) {
                        break L43;
                      } else {
                        var2_int = 3;
                        var3 = 60;
                        break L43;
                      }
                    }
                    L44: {
                      if (((kb) this).field_F >= 3) {
                        var3 = 74;
                        var2_int = 3;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      if (((kb) this).field_F >= 4) {
                        var3 = 90;
                        var2_int = 4;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 119);
                    L46: while (true) {
                      if (var4_ref_pd == null) {
                        break L21;
                      } else {
                        var5 = -var4_ref_pd.field_z + ((kb) this).field_A;
                        var6 = -var4_ref_pd.field_u + ((kb) this).field_x;
                        stackOut_158_0 = -8;
                        stackOut_158_1 = ~var4_ref_pd.field_y;
                        stackIn_178_0 = stackOut_158_0;
                        stackIn_178_1 = stackOut_158_1;
                        stackIn_159_0 = stackOut_158_0;
                        stackIn_159_1 = stackOut_158_1;
                        if (var10 != 0) {
                          break L20;
                        } else {
                          L47: {
                            if (stackIn_159_0 == stackIn_159_1) {
                              break L47;
                            } else {
                              if (4 == var4_ref_pd.field_y) {
                                break L47;
                              } else {
                                if (var4_ref_pd.field_o - var4_ref_pd.field_h <= 0) {
                                  break L47;
                                } else {
                                  if (var2_int < Math.abs(var5)) {
                                    break L47;
                                  } else {
                                    if (var2_int < Math.abs(var6)) {
                                      break L47;
                                    } else {
                                      var7 = var4_ref_pd.field_t;
                                      var8 = 0;
                                      L48: while (true) {
                                        if (var8 >= ((kb) this).field_D) {
                                          break L47;
                                        } else {
                                          stackOut_171_0 = ~var7;
                                          stackOut_171_1 = ~((kb) this).field_i[var8];
                                          stackIn_178_0 = stackOut_171_0;
                                          stackIn_178_1 = stackOut_171_1;
                                          stackIn_172_0 = stackOut_171_0;
                                          stackIn_172_1 = stackOut_171_1;
                                          if (var10 != 0) {
                                            break L20;
                                          } else {
                                            L49: {
                                              if (stackIn_172_0 != stackIn_172_1) {
                                                break L49;
                                              } else {
                                                this.a(var3, var4_ref_pd, param0 + -29);
                                                break L49;
                                              }
                                            }
                                            var8++;
                                            if (var10 == 0) {
                                              continue L48;
                                            } else {
                                              break L47;
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
                          var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                          if (var10 == 0) {
                            continue L46;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                  } else {
                    break L21;
                  }
                }
              } else {
                break L21;
              }
            }
            stackOut_177_0 = ~((kb) this).field_C;
            stackOut_177_1 = -6;
            stackIn_178_0 = stackOut_177_0;
            stackIn_178_1 = stackOut_177_1;
            break L20;
          }
          L50: {
            if (stackIn_178_0 != stackIn_178_1) {
              break L50;
            } else {
              this.b((byte) 12);
              break L50;
            }
          }
          stackOut_180_0 = this;
          stackOut_180_1 = this;
          stackIn_181_0 = (kb) (Object) stackOut_180_0;
          stackIn_181_1 = stackOut_180_1;
          break L3;
        }
        L51: {
          this.field_t = ((kb) this).field_t - 1;
          if (0 < ((kb) this).field_t) {
            break L51;
          } else {
            if (6 == ((kb) this).field_C) {
              break L51;
            } else {
              L52: {
                ((kb) this).field_z = false;
                if (((kb) this).field_v > 0) {
                  break L52;
                } else {
                  ((kb) this).field_t = 5;
                  if (var10 == 0) {
                    break L51;
                  } else {
                    break L52;
                  }
                }
              }
              L53: {
                L54: {
                  L55: {
                    L56: {
                      ((kb) this).field_t = 5;
                      var2 = null;
                      if (4 == ((kb) this).field_C) {
                        L57: {
                          var3_ref_pd = ((kb) this).field_E;
                          var4 = -10000;
                          if (var3_ref_pd == null) {
                            break L57;
                          } else {
                            if (0 >= -var3_ref_pd.field_h + var3_ref_pd.field_o) {
                              break L57;
                            } else {
                              L58: {
                                var5 = ((kb) this).field_h - var3_ref_pd.field_z;
                                var6 = ((kb) this).field_g - var3_ref_pd.field_u;
                                if (var3_ref_pd.field_y != 9) {
                                  break L58;
                                } else {
                                  if (0 == var3_ref_pd.field_E) {
                                    break L57;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              if (-var3_ref_pd.field_h + var3_ref_pd.field_o <= 0) {
                                break L57;
                              } else {
                                if (~Math.abs(var5) < ~((kb) this).field_l) {
                                  break L57;
                                } else {
                                  if (~Math.abs(var6) < ~((kb) this).field_l) {
                                    break L57;
                                  } else {
                                    var7 = var3_ref_pd.field_t;
                                    var8 = 0;
                                    L59: while (true) {
                                      if (~var8 <= ~((kb) this).field_D) {
                                        break L57;
                                      } else {
                                        stackOut_246_0 = ((kb) this).field_i[var8];
                                        stackOut_246_1 = var7;
                                        stackIn_283_0 = stackOut_246_0;
                                        stackIn_283_1 = stackOut_246_1;
                                        stackIn_247_0 = stackOut_246_0;
                                        stackIn_247_1 = stackOut_246_1;
                                        if (var10 != 0) {
                                          break L54;
                                        } else {
                                          L60: {
                                            if (stackIn_247_0 != stackIn_247_1) {
                                              break L60;
                                            } else {
                                              var2 = (Object) (Object) var3_ref_pd;
                                              break L60;
                                            }
                                          }
                                          var8++;
                                          if (var10 == 0) {
                                            continue L59;
                                          } else {
                                            break L57;
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
                          var3_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 127);
                          L61: while (true) {
                            if (var3_ref_pd == null) {
                              break L56;
                            } else {
                              var5 = ((kb) this).field_h - var3_ref_pd.field_z;
                              var6 = -var3_ref_pd.field_u + ((kb) this).field_g;
                              stackOut_255_0 = var3_ref_pd.field_y;
                              stackOut_255_1 = 4;
                              stackIn_283_0 = stackOut_255_0;
                              stackIn_283_1 = stackOut_255_1;
                              stackIn_256_0 = stackOut_255_0;
                              stackIn_256_1 = stackOut_255_1;
                              if (var10 != 0) {
                                break L54;
                              } else {
                                L62: {
                                  if (stackIn_256_0 == stackIn_256_1) {
                                    break L62;
                                  } else {
                                    L63: {
                                      if (var3_ref_pd.field_y != 9) {
                                        break L63;
                                      } else {
                                        if (var3_ref_pd.field_E == 0) {
                                          break L62;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                    if (-var3_ref_pd.field_h + var3_ref_pd.field_o <= 0) {
                                      break L62;
                                    } else {
                                      if (Math.abs(var5) > ((kb) this).field_l) {
                                        break L62;
                                      } else {
                                        if (~Math.abs(var6) >= ~((kb) this).field_l) {
                                          var7 = var3_ref_pd.field_t;
                                          var8 = 0;
                                          L64: while (true) {
                                            if (((kb) this).field_D <= var8) {
                                              break L62;
                                            } else {
                                              stackOut_271_0 = ~var7;
                                              stackOut_271_1 = ~((kb) this).field_i[var8];
                                              stackIn_283_0 = stackOut_271_0;
                                              stackIn_283_1 = stackOut_271_1;
                                              stackIn_272_0 = stackOut_271_0;
                                              stackIn_272_1 = stackOut_271_1;
                                              if (var10 != 0) {
                                                break L54;
                                              } else {
                                                L65: {
                                                  if (stackIn_272_0 == stackIn_272_1) {
                                                    var9 = Math.abs(var5) + (Math.abs(var6) + -(Math.abs(var5) * Math.abs(var6)));
                                                    if (var9 > var4) {
                                                      var2 = (Object) (Object) var3_ref_pd;
                                                      var4 = var9;
                                                      break L65;
                                                    } else {
                                                      break L65;
                                                    }
                                                  } else {
                                                    break L65;
                                                  }
                                                }
                                                var8++;
                                                if (var10 == 0) {
                                                  continue L64;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L62;
                                        }
                                      }
                                    }
                                  }
                                }
                                var3_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(853);
                                if (var10 == 0) {
                                  continue L61;
                                } else {
                                  break L56;
                                }
                              }
                            }
                          }
                        } else {
                          break L56;
                        }
                      } else {
                        var3 = 10000;
                        var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.b((byte) 124);
                        L66: while (true) {
                          L67: {
                            if (var4_ref_pd == null) {
                              break L67;
                            } else {
                              var5 = ((kb) this).field_h + -var4_ref_pd.field_z;
                              var6 = ((kb) this).field_g - var4_ref_pd.field_u;
                              stackOut_191_0 = 7;
                              stackOut_191_1 = var4_ref_pd.field_y;
                              stackIn_282_0 = stackOut_191_0;
                              stackIn_282_1 = stackOut_191_1;
                              stackIn_192_0 = stackOut_191_0;
                              stackIn_192_1 = stackOut_191_1;
                              if (var10 != 0) {
                                break L55;
                              } else {
                                L68: {
                                  L69: {
                                    if (stackIn_192_0 != stackIn_192_1) {
                                      break L69;
                                    } else {
                                      if (2 == ((kb) this).field_C) {
                                        break L68;
                                      } else {
                                        break L69;
                                      }
                                    }
                                  }
                                  L70: {
                                    if (4 != var4_ref_pd.field_y) {
                                      break L70;
                                    } else {
                                      if (0 == ((kb) this).field_C) {
                                        break L70;
                                      } else {
                                        if (((kb) this).field_C == 3) {
                                          break L70;
                                        } else {
                                          if (((kb) this).field_C == 1) {
                                            break L70;
                                          } else {
                                            if (5 != ((kb) this).field_C) {
                                              break L68;
                                            } else {
                                              break L70;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L71: {
                                    if (3 == ((kb) this).field_C) {
                                      break L71;
                                    } else {
                                      if (((kb) this).field_C == 5) {
                                        break L71;
                                      } else {
                                        if (9 != var4_ref_pd.field_y) {
                                          break L71;
                                        } else {
                                          if (var4_ref_pd.field_E == 0) {
                                            break L68;
                                          } else {
                                            break L71;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (-var4_ref_pd.field_h + var4_ref_pd.field_o <= 0) {
                                    break L68;
                                  } else {
                                    if (Math.abs(var5) > ((kb) this).field_l) {
                                      break L68;
                                    } else {
                                      if (~Math.abs(var6) < ~((kb) this).field_l) {
                                        break L68;
                                      } else {
                                        var7 = var4_ref_pd.field_t;
                                        var8 = 0;
                                        L72: while (true) {
                                          if (((kb) this).field_D <= var8) {
                                            break L68;
                                          } else {
                                            stackOut_222_0 = ~var7;
                                            stackOut_222_1 = ~((kb) this).field_i[var8];
                                            stackIn_282_0 = stackOut_222_0;
                                            stackIn_282_1 = stackOut_222_1;
                                            stackIn_223_0 = stackOut_222_0;
                                            stackIn_223_1 = stackOut_222_1;
                                            if (var10 != 0) {
                                              break L55;
                                            } else {
                                              L73: {
                                                if (stackIn_223_0 == stackIn_223_1) {
                                                  var9 = var5 * var5 - -(var6 * var6);
                                                  if (~var3 < ~var9) {
                                                    var2 = (Object) (Object) var4_ref_pd;
                                                    var3 = var9;
                                                    break L73;
                                                  } else {
                                                    break L73;
                                                  }
                                                } else {
                                                  break L73;
                                                }
                                              }
                                              var8++;
                                              if (var10 == 0) {
                                                continue L72;
                                              } else {
                                                break L68;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var4_ref_pd = (pd) (Object) ((kb) this).field_f.field_r.d(param0 ^ 780);
                                if (var10 == 0) {
                                  continue L66;
                                } else {
                                  break L67;
                                }
                              }
                            }
                          }
                          break L56;
                        }
                      }
                    }
                    if (var2 == null) {
                      break L53;
                    } else {
                      stackOut_281_0 = 5 + ((kb) this).field_C * 5;
                      stackOut_281_1 = ((kb) this).field_F;
                      stackIn_282_0 = stackOut_281_0;
                      stackIn_282_1 = stackOut_281_1;
                      break L55;
                    }
                  }
                  var4 = stackIn_282_0 + stackIn_282_1;
                  stackOut_282_0 = ~((kb) this).field_C;
                  stackOut_282_1 = -6;
                  stackIn_283_0 = stackOut_282_0;
                  stackIn_283_1 = stackOut_282_1;
                  break L54;
                }
                L74: {
                  if (stackIn_283_0 == stackIn_283_1) {
                    var4 = 58;
                    break L74;
                  } else {
                    break L74;
                  }
                }
                L75: {
                  L76: {
                    L77: {
                      L78: {
                        L79: {
                          L80: {
                            L81: {
                              hf discarded$4 = ea.a(46, mh.field_a[var4], (int)(((kb) this).field_u * 96.0));
                              ((kb) this).field_v = ((kb) this).field_v - 1;
                              ((kb) this).field_z = true;
                              ((kb) this).field_q = (int)(Math.atan2((double)(((kb) this).field_g + -((pd) var2).field_u), (double)(-((pd) var2).field_z + ((kb) this).field_h)) * 65536.0 / 6.283185307179586);
                              var5 = ((kb) this).field_C;
                              if (var5 == 0) {
                                break L81;
                              } else {
                                if (var5 == 1) {
                                  break L80;
                                } else {
                                  if (2 == var5) {
                                    break L79;
                                  } else {
                                    L82: {
                                      if (var5 != 4) {
                                        break L82;
                                      } else {
                                        if (var10 == 0) {
                                          break L78;
                                        } else {
                                          break L82;
                                        }
                                      }
                                    }
                                    L83: {
                                      if (3 != var5) {
                                        break L83;
                                      } else {
                                        if (var10 == 0) {
                                          break L77;
                                        } else {
                                          break L83;
                                        }
                                      }
                                    }
                                    if (5 != var5) {
                                      break L75;
                                    } else {
                                      if (var10 == 0) {
                                        break L76;
                                      } else {
                                        break L81;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L84: {
                              ((kb) this).field_t = 50;
                              if (((kb) this).field_F != 1) {
                                break L84;
                              } else {
                                ((kb) this).field_t = 50;
                                break L84;
                              }
                            }
                            L85: {
                              if (((kb) this).field_F != 2) {
                                break L85;
                              } else {
                                ((kb) this).field_t = 25;
                                break L85;
                              }
                            }
                            L86: {
                              if (3 == ((kb) this).field_F) {
                                ((kb) this).field_t = 40;
                                break L86;
                              } else {
                                break L86;
                              }
                            }
                            L87: {
                              ((kb) this).field_A = ((pd) var2).field_z;
                              if (4 != ((kb) this).field_F) {
                                break L87;
                              } else {
                                ((kb) this).field_t = 25;
                                break L87;
                              }
                            }
                            ((kb) this).field_E = (pd) var2;
                            ((kb) this).field_x = ((pd) var2).field_u;
                            if (var10 == 0) {
                              break L75;
                            } else {
                              break L80;
                            }
                          }
                          L88: {
                            var3 = 10;
                            ((kb) this).field_t = 100;
                            if (((kb) this).field_F != 1) {
                              break L88;
                            } else {
                              ((kb) this).field_t = 80;
                              break L88;
                            }
                          }
                          L89: {
                            if (((kb) this).field_F == 2) {
                              ((kb) this).field_t = 60;
                              break L89;
                            } else {
                              break L89;
                            }
                          }
                          L90: {
                            if (3 == ((kb) this).field_F) {
                              ((kb) this).field_t = 40;
                              break L90;
                            } else {
                              break L90;
                            }
                          }
                          L91: {
                            ((kb) this).field_x = ((pd) var2).field_u;
                            if (((kb) this).field_F == 4) {
                              ((kb) this).field_t = 20;
                              break L91;
                            } else {
                              break L91;
                            }
                          }
                          ((kb) this).field_E = (pd) var2;
                          ((kb) this).field_A = ((pd) var2).field_z;
                          this.a(var3, (pd) var2, param0 ^ 71);
                          ((kb) this).field_f.field_h.a(-122, (ca) (Object) new me((double)((kb) this).field_x, (double)((kb) this).field_A, 7));
                          if (var10 == 0) {
                            break L75;
                          } else {
                            break L79;
                          }
                        }
                        ((kb) this).field_t = 100;
                        ((kb) this).field_A = ((pd) var2).field_z;
                        ((kb) this).field_x = ((pd) var2).field_u;
                        if (var10 == 0) {
                          break L75;
                        } else {
                          break L78;
                        }
                      }
                      L92: {
                        var3 = 20;
                        ((kb) this).field_t = 5 + -((kb) this).field_F;
                        ((kb) this).field_x = ((pd) var2).field_u;
                        ((kb) this).field_A = ((pd) var2).field_z;
                        if ((Object) (Object) ((kb) this).field_E != var2) {
                          break L92;
                        } else {
                          this.a(var3, (pd) var2, -117);
                          if (var10 == 0) {
                            break L75;
                          } else {
                            break L92;
                          }
                        }
                      }
                      ((kb) this).field_t = 100;
                      ((kb) this).field_E = (pd) var2;
                      if (var10 == 0) {
                        break L75;
                      } else {
                        break L77;
                      }
                    }
                    L93: {
                      ((kb) this).field_t = 100;
                      if (((kb) this).field_F != 1) {
                        break L93;
                      } else {
                        ((kb) this).field_t = 90;
                        break L93;
                      }
                    }
                    L94: {
                      if (2 != ((kb) this).field_F) {
                        break L94;
                      } else {
                        ((kb) this).field_t = 80;
                        break L94;
                      }
                    }
                    L95: {
                      if (((kb) this).field_F != 3) {
                        break L95;
                      } else {
                        ((kb) this).field_t = 70;
                        break L95;
                      }
                    }
                    L96: {
                      if (((kb) this).field_F != 4) {
                        break L96;
                      } else {
                        ((kb) this).field_t = 60;
                        break L96;
                      }
                    }
                    ((kb) this).field_x = ((pd) var2).field_u;
                    ((kb) this).field_A = ((pd) var2).field_z;
                    if (var10 == 0) {
                      break L75;
                    } else {
                      break L76;
                    }
                  }
                  L97: {
                    L98: {
                      ((kb) this).field_t = 500;
                      ((kb) this).field_A = ((pd) var2).field_z;
                      ((kb) this).field_x = ((pd) var2).field_u;
                      var3 = 5;
                      if (((kb) this).field_F == 1) {
                        break L98;
                      } else {
                        L99: {
                          if (((kb) this).field_F != 2) {
                            break L99;
                          } else {
                            var3 = 20;
                            if (var10 == 0) {
                              break L97;
                            } else {
                              break L99;
                            }
                          }
                        }
                        L100: {
                          if (3 == ((kb) this).field_F) {
                            break L100;
                          } else {
                            if (((kb) this).field_F == 4) {
                              var3 = 80;
                              if (var10 == 0) {
                                break L97;
                              } else {
                                break L100;
                              }
                            } else {
                              break L97;
                            }
                          }
                        }
                        var3 = 40;
                        if (var10 == 0) {
                          break L97;
                        } else {
                          break L98;
                        }
                      }
                    }
                    var3 = 10;
                    break L97;
                  }
                  L101: {
                    ((kb) this).field_y = 0;
                    boolean discarded$5 = this.a(((kb) this).field_x, (float)((kb) this).field_g + 0.5f, 38, ((kb) this).field_A, (float)(-2 + ((kb) this).field_h));
                    if (((pd) var2).field_y != 7) {
                      break L101;
                    } else {
                      ((pd) var2).field_f = 120;
                      if (var10 == 0) {
                        break L75;
                      } else {
                        break L101;
                      }
                    }
                  }
                  ((pd) var2).field_f = 60;
                  this.a(var3, (pd) var2, param0 + 27);
                  break L75;
                }
                ((kb) this).field_n = ((kb) this).field_t;
                if (var10 == 0) {
                  break L51;
                } else {
                  break L53;
                }
              }
              ((kb) this).field_t = 5;
              break L51;
            }
          }
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
                  var7_int = -((kb) this).field_g + param4;
                  var8 = param5 + -((kb) this).field_h;
                  var11 = 5;
                  if (1 == ((kb) this).field_f.field_m) {
                    break L2;
                  } else {
                    if (((kb) this).field_f.field_m == 2) {
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
                      var10 = ((kb) this).field_h + var12 * var8 / param2;
                      var9 = var7_int * var12 / param2 + ((kb) this).field_g;
                      stackOut_13_0 = ((kb) this).field_f.field_f.a(var9, true, var10);
                      stackIn_52_0 = stackOut_13_0 ? 1 : 0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var16 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_14_0) {
                            break L6;
                          } else {
                            var13 = var9 + ((kb) this).field_f.field_f.field_c * var10;
                            var14 = 1;
                            var15 = 0;
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if (~var15 <= ~param3) {
                                    break L9;
                                  } else {
                                    stackOut_19_0 = ~((kb) this).field_i[var15];
                                    stackOut_19_1 = ~var13;
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
                                stackOut_27_0 = (var10 + -((kb) this).field_h) * (var10 + -((kb) this).field_h) + (-((kb) this).field_g + var9) * (-((kb) this).field_g + var9);
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
                                  if (~param1 < ~var12) {
                                    break L12;
                                  } else {
                                    if (~var9 >= ~var11) {
                                      break L12;
                                    } else {
                                      if (((kb) this).field_f.field_f.field_o[var9 - -(((kb) this).field_f.field_f.field_c * var10)] == 6) {
                                        break L12;
                                      } else {
                                        if (((kb) this).field_f.field_f.field_o[((kb) this).field_f.field_f.field_c * var10 + var9] != 10) {
                                          ((kb) this).field_i[param3] = var13;
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
                        return stackIn_49_0;
                      }
                    }
                  }
                  stackOut_51_0 = param3;
                  stackIn_52_0 = stackOut_51_0;
                  break L4;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = -87;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var7, "kb.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_52_0;
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
                ((kb) this).field_r = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != ((kb) this).field_s) {
                  L4: {
                    L5: {
                      var2_int = ((kb) this).field_s.field_w;
                      var3 = 1;
                      if (~((kb) this).field_g >= ~((kb) this).field_s.field_g) {
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
                      if (((kb) this).field_h >= ((kb) this).field_s.field_h) {
                        break L6;
                      } else {
                        var3 = ((kb) this).field_f.field_f.field_c;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (~((kb) this).field_s.field_h > ~((kb) this).field_h) {
                      var3 = -((kb) this).field_f.field_f.field_c;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = ((kb) this).field_w;
                  L7: while (true) {
                    if (var2_int == var4) {
                      break L3;
                    } else {
                      ((kb) this).field_f.field_f.field_e[var4] = false;
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
          throw dd.a((Throwable) (Object) var2, "kb.L(" + param0 + ')');
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
                ((kb) this).field_j = -82;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((kb) this).field_C != -1) {
                  var2_int = oj.a((byte) 47, ((kb) this).field_C);
                  var3 = ((kb) this).field_g;
                  L4: while (true) {
                    if (~(var2_int + ((kb) this).field_g) >= ~var3) {
                      break L3;
                    } else {
                      if (var5 != 0) {
                        break L2;
                      } else {
                        var4 = ((kb) this).field_h;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (((kb) this).field_h + var2_int <= var4) {
                                break L7;
                              } else {
                                ((kb) this).field_f.field_f.field_o[var3 + var4 * ((kb) this).field_f.field_f.field_c] = 9;
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
          throw dd.a((Throwable) (Object) var2, "kb.M(" + param0 + ')');
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
        ((kb) this).field_n = 0;
        try {
          L0: {
            L1: {
              ((kb) this).field_z = false;
              ((kb) this).field_C = param2;
              ((kb) this).field_p = param4;
              ((kb) this).field_v = 200;
              ((kb) this).field_t = 0;
              ((kb) this).field_f = param5;
              ((kb) this).field_F = param3;
              ((kb) this).b(0, param1, param0);
              if (((kb) this).field_D > 0) {
                ((kb) this).field_q = (int)(Math.atan2((double)(((kb) this).field_g - ((kb) this).field_i[0] % ((kb) this).field_f.field_f.field_c), (double)(-(((kb) this).field_i[0] / ((kb) this).field_f.field_f.field_c) + ((kb) this).field_h)) * 65536.0 / 6.283185307179586);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((kb) this).field_o = ((kb) this).field_q;
              if (6 != ((kb) this).field_C) {
                break L2;
              } else {
                ((kb) this).field_j = 100;
                break L2;
              }
            }
            ((kb) this).field_E = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7;
            stackOut_9_1 = new StringBuilder().append("kb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
    }
}
