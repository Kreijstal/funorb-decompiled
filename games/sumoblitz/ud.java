/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends hj {
    private tv field_t;
    private int field_C;
    static hr[] field_q;
    private int[] field_s;
    private tv field_y;
    private int[] field_A;
    private boolean field_u;
    static ri field_p;
    private tv field_v;
    private int field_z;
    private int field_B;
    private bs field_D;
    private boolean field_w;
    bs field_r;
    bs field_x;
    private int field_o;

    public static void c(int param0) {
        field_p = null;
        int var1 = -38;
        field_q = null;
    }

    final synchronized void a(int param0, int param1, tv param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_34_0 = 0;
        bs stackIn_42_0 = null;
        bs stackIn_43_0 = null;
        bs stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        bs stackIn_52_0 = null;
        bs stackIn_53_0 = null;
        bs stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        bs stackOut_51_0 = null;
        bs stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        bs stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        bs stackOut_41_0 = null;
        bs stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        bs stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((ud) this).field_u) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    if (((ud) this).field_C <= 0) {
                      L3: {
                        if (null != ((ud) this).field_y) {
                          ((ud) this).field_r.e(0);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((ud) this).field_y = param2;
                      if (param2 != null) {
                        ((ud) this).field_r.a(false, param2, 60);
                        this.a(param1, (byte) 24, ((ud) this).field_r, param5);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((ud) this).field_v != null) {
                          ((ud) this).field_x.e(0);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((ud) this).field_v = param2;
                      if (param2 == null) {
                        break L2;
                      } else {
                        ((ud) this).field_x.a(false, param2, 117);
                        this.a(param1, (byte) 39, ((ud) this).field_x, param5);
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              if (param0 == 1) {
                break L5;
              } else {
                var9 = null;
                ud.a(57, -30, 8, 30, (wb[]) null);
                break L5;
              }
            }
            L6: {
              stackOut_19_0 = this;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (!param3) {
                stackOut_21_0 = this;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L6;
              } else {
                stackOut_20_0 = this;
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L6;
              }
            }
            ((ud) this).field_u = stackIn_22_1 != 0;
            if (param2 != ((ud) this).field_v) {
              if (param2 != ((ud) this).field_y) {
                L7: {
                  if (((ud) this).field_v != null) {
                    if (((ud) this).field_y == null) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (524288 <= ((ud) this).field_o) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L8;
                        } else {
                          stackOut_32_0 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_34_0;
                      break L7;
                    }
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                L9: {
                  if (var7_int == 0) {
                    L10: {
                      if (null != ((ud) this).field_y) {
                        ((ud) this).field_r.e(0);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      ((ud) this).field_y = param2;
                      if (param2 != null) {
                        L12: {
                          stackOut_51_0 = ((ud) this).field_r;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_52_0 = stackOut_51_0;
                          if (param3) {
                            stackOut_53_0 = (bs) (Object) stackIn_53_0;
                            stackOut_53_1 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            break L12;
                          } else {
                            stackOut_52_0 = (bs) (Object) stackIn_52_0;
                            stackOut_52_1 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            stackIn_54_1 = stackOut_52_1;
                            break L12;
                          }
                        }
                        ((bs) (Object) stackIn_54_0).a(stackIn_54_1 != 0, param2, param0 + 67);
                        this.a(param1, (byte) 45, ((ud) this).field_r, param5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((ud) this).field_C = -param4;
                    break L9;
                  } else {
                    L13: {
                      if (null == ((ud) this).field_v) {
                        break L13;
                      } else {
                        ((ud) this).field_x.e(param0 + -1);
                        break L13;
                      }
                    }
                    L14: {
                      ((ud) this).field_v = param2;
                      if (param2 != null) {
                        L15: {
                          stackOut_41_0 = ((ud) this).field_x;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (param3) {
                            stackOut_43_0 = (bs) (Object) stackIn_43_0;
                            stackOut_43_1 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            break L15;
                          } else {
                            stackOut_42_0 = (bs) (Object) stackIn_42_0;
                            stackOut_42_1 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            break L15;
                          }
                        }
                        ((bs) (Object) stackIn_44_0).a(stackIn_44_1 != 0, param2, 121);
                        this.a(param1, (byte) -114, ((ud) this).field_x, param5);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    ((ud) this).field_C = param4;
                    break L9;
                  }
                }
                break L0;
              } else {
                ((ud) this).field_C = -param4;
                this.a(param1, (byte) -82, ((ud) this).field_r, param5);
                return;
              }
            } else {
              ((ud) this).field_C = param4;
              this.a(param1, (byte) -114, ((ud) this).field_x, param5);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var7;
            stackOut_57_1 = new StringBuilder().append("ud.I(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L16;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L16;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wb[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (param1 <= 0) {
                  break L1;
                } else {
                  var5_int = param4[0].field_z;
                  var6 = param4[2].field_z;
                  var7 = param4[1].field_z;
                  param4[0].a(param3, param0);
                  param4[param2].a(-var6 + (param1 + param3), param0);
                  lk.b(mo.field_t);
                  lk.e(param3 + var5_int, param0, -var6 + param3 - -param1, param4[1].field_w + param0);
                  var8 = param3 + var5_int;
                  var9 = param1 + param3 + -var6;
                  param3 = var8;
                  L2: while (true) {
                    if (param3 >= var9) {
                      lk.a(mo.field_t);
                      break L0;
                    } else {
                      param4[1].a(param3, param0);
                      param3 = param3 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ud.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void a(int param0, byte param1, bs param2, int param3) {
        try {
            param2.a((byte) -86, -1, param3);
            param2.b(param0, 0);
            int var5_int = -21 / ((param1 - -28) / 47);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ud.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -43) {
            return;
        }
        ((ud) this).field_B = param1;
    }

    private final void a(bs param0, int param1, bs param2) {
        try {
            ((ud) this).field_o = 1048576;
            ((ud) this).field_r = param0;
            ((ud) this).field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ud.H(" + (param0 != null ? "{...}" : "null") + ',' + -79 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final hj c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (((ud) this).field_o <= 0) {
            if (((ud) this).field_o >= 1048576) {
              break L0;
            } else {
              if (null == ((ud) this).field_y) {
                break L0;
              } else {
                ((ud) this).field_r.a(param0);
                break L0;
              }
            }
          } else {
            if (((ud) this).field_o >= 1048576) {
              break L0;
            } else {
              if (null == ((ud) this).field_y) {
                break L0;
              } else {
                ((ud) this).field_r.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((ud) this).field_z) {
            break L1;
          } else {
            if (((ud) this).field_t == null) {
              break L1;
            } else {
              ((ud) this).field_D.a(param0);
              break L1;
            }
          }
        }
        L2: {
          if (!((ud) this).field_u) {
            break L2;
          } else {
            L3: {
              if (((ud) this).field_C <= 0) {
                break L3;
              } else {
                if (!((ud) this).field_x.c(-8192)) {
                  ((ud) this).field_C = -((ud) this).field_C;
                  ((ud) this).field_u = false;
                  ((ud) this).field_v = null;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 <= ((ud) this).field_C) {
              break L2;
            } else {
              if (!((ud) this).field_r.c(-8192)) {
                ((ud) this).field_C = -((ud) this).field_C;
                ((ud) this).field_y = null;
                ((ud) this).field_u = false;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (((ud) this).field_C != 0) {
            ((ud) this).field_o = ((ud) this).field_o + ((ud) this).field_C * param0;
            if (((ud) this).field_o < 1048576) {
              if (0 < ((ud) this).field_o) {
                break L4;
              } else {
                ((ud) this).field_o = 0;
                if (!((ud) this).field_u) {
                  ((ud) this).field_C = 0;
                  if (((ud) this).field_w) {
                    break L4;
                  } else {
                    L5: {
                      if (((ud) this).field_v == null) {
                        break L5;
                      } else {
                        ((ud) this).field_x.e(0);
                        break L5;
                      }
                    }
                    ((ud) this).field_v = null;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            } else {
              ((ud) this).field_o = 1048576;
              if (!((ud) this).field_u) {
                ((ud) this).field_C = 0;
                if (!((ud) this).field_w) {
                  L6: {
                    if (((ud) this).field_y != null) {
                      ((ud) this).field_r.e(0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((ud) this).field_y = null;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
          } else {
            break L4;
          }
        }
    }

    final synchronized int d() {
        return 2;
    }

    final hj a() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (((ud) this).field_B > 0) {
              L1: {
                if (!((ud) this).field_u) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= ((ud) this).field_C) {
                      break L2;
                    } else {
                      if (!((ud) this).field_x.c(-8192)) {
                        ((ud) this).field_u = false;
                        ((ud) this).field_C = -((ud) this).field_C;
                        ((ud) this).field_v = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (0 <= ((ud) this).field_C) {
                    break L1;
                  } else {
                    if (!((ud) this).field_r.c(-8192)) {
                      ((ud) this).field_y = null;
                      ((ud) this).field_C = -((ud) this).field_C;
                      ((ud) this).field_u = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (((ud) this).field_o >> 12) * ((ud) this).field_B / 256;
                var5 = ((ud) this).field_B - var4_int;
                if (((ud) this).field_C == 0) {
                  break L3;
                } else {
                  ((ud) this).field_o = ((ud) this).field_o + ((ud) this).field_C * param2;
                  if (((ud) this).field_o < 1048576) {
                    if (0 < ((ud) this).field_o) {
                      break L3;
                    } else {
                      ((ud) this).field_o = 0;
                      if (((ud) this).field_u) {
                        break L3;
                      } else {
                        ((ud) this).field_C = 0;
                        if (!((ud) this).field_w) {
                          L4: {
                            if (null != ((ud) this).field_v) {
                              ((ud) this).field_x.e(0);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((ud) this).field_v = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    ((ud) this).field_o = 1048576;
                    if (!((ud) this).field_u) {
                      ((ud) this).field_C = 0;
                      if (!((ud) this).field_w) {
                        L5: {
                          if (null == ((ud) this).field_y) {
                            break L5;
                          } else {
                            ((ud) this).field_r.e(0);
                            break L5;
                          }
                        }
                        ((ud) this).field_y = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L6: {
                if (du.field_o) {
                  stackOut_32_0 = param2 << 1;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (((ud) this).field_z >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (((ud) this).field_v != null) {
                      break L8;
                    } else {
                      if (((ud) this).field_y == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((ud) this).field_x.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (256 != var5) {
                      L9: {
                        L10: {
                          if (((ud) this).field_s == null) {
                            break L10;
                          } else {
                            if (var6 <= ((ud) this).field_s.length) {
                              la.a(((ud) this).field_s, 0, var6);
                              la.a(((ud) this).field_A, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((ud) this).field_s = new int[var6];
                        ((ud) this).field_A = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((ud) this).field_x.b(((ud) this).field_s, 0, param2);
                        ((ud) this).field_r.b(((ud) this).field_A, 0, param2);
                        if (!du.field_o) {
                          stackOut_47_0 = param1;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_46_0 = param1 << 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var5 * ((ud) this).field_A[var8] + var4_int * ((ud) this).field_s[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((ud) this).field_r.b(param0, param1, param2);
                      break L7;
                    }
                  }
                }
              }
              L13: {
                if (null == ((ud) this).field_t) {
                  break L13;
                } else {
                  if (((ud) this).field_z == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (((ud) this).field_s == null) {
                          break L15;
                        } else {
                          if (var6 > ((ud) this).field_s.length) {
                            break L15;
                          } else {
                            la.a(((ud) this).field_s, 0, var6);
                            break L14;
                          }
                        }
                      }
                      ((ud) this).field_A = new int[var6];
                      ((ud) this).field_s = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((ud) this).field_D.b(((ud) this).field_s, 0, param2);
                      if (du.field_o) {
                        param1 = param1 << 1;
                        stackOut_60_0 = param1 << 1;
                        stackIn_61_0 = stackOut_60_0;
                        break L16;
                      } else {
                        stackOut_59_0 = param1;
                        stackIn_61_0 = stackOut_59_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_61_0;
                    var8 = ((ud) this).field_z * ((ud) this).field_B / 256;
                    var9 = ((ud) this).field_B - var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = ((ud) this).field_s[var10] * var8 + param0[var10 + var7] * var9 >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              ((ud) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var4;
            stackOut_65_1 = new StringBuilder().append("ud.J(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L18;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L18;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ud(bs param0, bs param1) {
        ((ud) this).field_B = 256;
        ((ud) this).field_w = false;
        ((ud) this).field_z = 0;
        try {
            this.a(param1, -79, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
