/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private ii[] field_a;
    static boolean field_d;
    private int field_f;
    static volatile boolean field_c;
    static String field_e;
    private int[] field_b;

    public static void a(byte param0) {
        if (param0 != -28) {
            return;
        }
        field_e = null;
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param1) {
          return (String) null;
        } else {
          var4 = param3.indexOf(param0);
          L0: while (true) {
            L1: {
              L2: {
                if (-1 == var4) {
                  break L2;
                } else {
                  param3 = param3.substring(0, var4) + param2 + param3.substring(param0.length() + var4);
                  stackOut_3_0 = (String) (param3);
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    var4 = ((String) (Object) stackIn_4_0).indexOf(param0, param2.length() + var4);
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_5_0 = (String) (param3);
              stackIn_6_0 = stackOut_5_0;
              break L1;
            }
            return stackIn_6_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        var13 = Transmogrify.field_A ? 1 : 0;
        var16 = this.field_a[0].field_j;
        var15 = var16;
        var14 = var15;
        var7 = var14;
        var8 = param0 & 16711935;
        var9 = param0 >> -1582457240 & 255;
        var10 = 0;
        L0: while (true) {
          L1: {
            if (this.field_b.length <= var10) {
              if (param2 != 3) {
                break L1;
              } else {
                L2: {
                  if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
                    break L2;
                  } else {
                    sb.a(ic.field_d);
                    this.field_a[0].a(param4, param1);
                    var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
                    sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
                    var11 = param4 - -this.field_a[0].field_f;
                    L3: while (true) {
                      L4: {
                        if (var11 >= var10) {
                          sb.b(ic.field_d);
                          this.field_a[2].b(var10, param1);
                          var11 = -this.field_a[4].field_f + (param4 - -param3);
                          sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                          break L4;
                        } else {
                          this.field_a[1].a(var11, param1);
                          var11 = var11 + this.field_a[1].field_f;
                          if (var13 != 0) {
                            break L4;
                          } else {
                            continue L3;
                          }
                        }
                      }
                      var12 = this.field_a[2].field_f + var10;
                      L5: while (true) {
                        if (var11 <= var12) {
                          sb.b(ic.field_d);
                          this.field_a[4].a(var11, param1);
                          if (var13 == 0) {
                            return;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          this.field_a[3].a(var12, param1);
                          var12 = var12 + this.field_a[3].field_f;
                          if (var13 != 0) {
                            if (var13 == 0) {
                              return;
                            } else {
                              break L2;
                            }
                          } else {
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } else {
              var11 = this.field_b[var10];
              var18 = var11 >> 870552456 ^ -1;
              var17 = var11 & 65535 ^ -1;
              if (var13 != 0) {
                if (var17 != var18) {
                  break L1;
                } else {
                  if (param3 >= this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
                    sb.a(ic.field_d);
                    this.field_a[0].a(param4, param1);
                    var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
                    sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
                    var11 = param4 - -this.field_a[0].field_f;
                    L6: while (true) {
                      L7: {
                        if (var11 >= var10) {
                          sb.b(ic.field_d);
                          this.field_a[2].b(var10, param1);
                          var11 = -this.field_a[4].field_f + (param4 - -param3);
                          sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                          break L7;
                        } else {
                          this.field_a[1].a(var11, param1);
                          var11 = var11 + this.field_a[1].field_f;
                          if (var13 != 0) {
                            break L7;
                          } else {
                            continue L6;
                          }
                        }
                      }
                      var12 = this.field_a[2].field_f + var10;
                      L8: while (true) {
                        if (var11 <= var12) {
                          sb.b(ic.field_d);
                          this.field_a[4].a(var11, param1);
                          if (var13 != 0) {
                            throw new RuntimeException();
                          } else {
                            return;
                          }
                        } else {
                          this.field_a[3].a(var12, param1);
                          var12 = var12 + this.field_a[3].field_f;
                          if (var13 != 0) {
                            if (var13 != 0) {
                              throw new RuntimeException();
                            } else {
                              return;
                            }
                          } else {
                            continue L8;
                          }
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L9: {
                  L10: {
                    if (var17 != var18) {
                      break L10;
                    } else {
                      var12 = var11 & 255;
                      var14[var10] = cl.b(vg.c(var12 * var8 >> -413372120, 16711935), vg.c(var9 * var12, 65280));
                      if (var13 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (this.field_f == var10) {
                    var16[var10] = param5;
                    break L9;
                  } else {
                    var10++;
                    continue L0;
                  }
                }
                var10++;
                continue L0;
              }
            }
          }
          L11: {
            this.field_f = -35;
            if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
              break L11;
            } else {
              sb.a(ic.field_d);
              this.field_a[0].a(param4, param1);
              var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
              sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
              var11 = param4 - -this.field_a[0].field_f;
              L12: while (true) {
                L13: {
                  if (var11 >= var10) {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    break L13;
                  } else {
                    this.field_a[1].a(var11, param1);
                    var11 = var11 + this.field_a[1].field_f;
                    if (var13 != 0) {
                      break L13;
                    } else {
                      if (var13 == 0) {
                        continue L12;
                      } else {
                        sb.b(ic.field_d);
                        this.field_a[2].b(var10, param1);
                        var11 = -this.field_a[4].field_f + (param4 - -param3);
                        sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                        var12 = this.field_a[2].field_f + var10;
                        L14: while (true) {
                          L15: {
                            if (var11 <= var12) {
                              sb.b(ic.field_d);
                              this.field_a[4].a(var11, param1);
                              break L15;
                            } else {
                              this.field_a[3].a(var12, param1);
                              var12 = var12 + this.field_a[3].field_f;
                              if (var13 != 0) {
                                break L15;
                              } else {
                                continue L14;
                              }
                            }
                          }
                          if (var13 == 0) {
                            return;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  }
                }
                var12 = this.field_a[2].field_f + var10;
                L16: while (true) {
                  if (var11 <= var12) {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    if (var13 == 0) {
                      return;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    this.field_a[3].a(var12, param1);
                    var12 = var12 + this.field_a[3].field_f;
                    if (var13 != 0) {
                      if (var13 == 0) {
                        return;
                      } else {
                        break L11;
                      }
                    } else {
                      continue L16;
                    }
                  }
                }
              }
            }
          }
          throw new RuntimeException();
        }
    }

    final static int a(int param0, boolean param1, int param2, boolean param3) {
        int discarded$0 = 0;
        if (!param3) {
            discarded$0 = mg.a(124, true, 121, true);
            return wf.a(-1);
        }
        return wf.a(-1);
    }

    final int a(boolean param0) {
        if (!param0) {
            return 117;
        }
        return this.field_a[0].field_g;
    }

    mg(ii[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
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
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            this.field_a = param0;
            this.field_b = new int[param0[0].field_j.length];
            ji.a(param0[0].field_j, 0, this.field_b, 0, this.field_b.length);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_b.length <= var2_int) {
                    break L3;
                  } else {
                    var3 = this.field_b[var2_int];
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((16756717 & var3) >> 705536496 ^ -1) >= -129) {
                          break L4;
                        } else {
                          if ((var3 & 65455) >> 1449862344 <= 128) {
                            break L4;
                          } else {
                            if (-129 >= (255 & var3 ^ -1)) {
                              break L4;
                            } else {
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_f = var2_int;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("mg.<init>(");
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
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_c = false;
        field_d = false;
    }
}
