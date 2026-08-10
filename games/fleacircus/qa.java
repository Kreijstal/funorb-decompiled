/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qa extends lh {
    boolean field_x;
    static int field_k;
    kd field_s;
    int field_u;
    int field_v;
    ch field_p;
    int field_r;
    static bi field_l;
    ne field_w;
    int field_n;
    static String field_o;
    int field_z;
    int field_j;
    int field_y;
    String field_i;
    String field_m;
    static String field_q;
    static String field_t;

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_z = param2;
        this.field_j = param3;
        if (param4 != 80) {
          field_k = 51;
          this.field_u = param1;
          this.field_y = param0;
          return;
        } else {
          this.field_u = param1;
          this.field_y = param0;
          return;
        }
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 122 % ((8 - param1) / 54);
            if (!param0.containsKey(this)) {
              param0.put(this, this);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("qa.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_t = null;
        field_q = null;
        field_l = null;
        if (param0 != 0) {
            field_q = (String) null;
        }
    }

    public final String toString() {
        return this.a(new StringBuilder(), new Hashtable(), 0, -83).toString();
    }

    StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 < -47) {
              L1: {
                if (this.a(param1, 108, param0, param2)) {
                  this.a(param2, 95, param0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (StringBuilder) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qa.S(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -26) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qa.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param3 < -85) {
              L1: {
                var5_int = this.b(param0, param1, 0, ag.field_f, kc.field_b) ? 1 : 0;
                if (var5_int != 0) {
                  stackIn_5_0 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  break L1;
                }
              }
              L2: {


                if (this.field_x) {

                  stackIn_8_1 = 0;
                  break L2;
                } else {

                  stackIn_8_1 = 1;
                  break L2;
                }
              }
              L3: {
                L4: {
                  if (stackIn_5_0 == stackIn_8_1) {
                    break L4;
                  } else {
                    L5: {
                      stackIn_11_0 = this;

                      if (var5_int == 0) {
                        stackIn_12_0 = this;
                        stackIn_12_1 = 0;
                        break L5;
                      } else {
                        stackIn_12_0 = this;
                        stackIn_12_1 = 1;
                        break L5;
                      }
                    }
                    ((qa) (this)).field_x = stackIn_12_1 != 0;
                    if (null == this.field_s) {
                      break L4;
                    } else {
                      if (this.field_s instanceof mb) {
                        ((mb) ((Object) this.field_s)).a(-12999, var5_int != 0, (qa) (this));
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L3;
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
          L6: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("qa.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.b(param0, param6, 0, param4, param2)) {
                this.field_v = param5;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1) {
              stackIn_6_0 = 0;
              break L0;
            } else {
              this.field_p = (ch) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("qa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static void a(byte param0, int param1) {
        try {
            try {
                eb.a("resizing", new Object[]{new Integer(param1)}, -11745, rl.a((byte) -116));
            } catch (Throwable throwable) {
            }
            int var2 = -46 % ((43 - param0) / 61);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        pk var6;
        int var7;
        pk var8;
        pk var9;
        pk var10;
        pk var11;
        pk var12;
        pk var13;
        var7 = fleas.field_A ? 1 : 0;
        this.a(param0, param3, (qa) (this), (byte) -111);
        var5 = this.e(1) ? 1 : 0;
        if (!param2) {
          L0: {
            if (var5 == 0) {
              break L0;
            } else {
              if (-1 == (jk.field_r ^ -1)) {
                break L0;
              } else {
                this.f(-1);
                ta.field_u = kc.field_f;
                if (param1 >= 38) {
                  df.a(0, this.g(4));
                  return param2;
                } else {
                  return false;
                }
              }
            }
          }
          ta.field_u = kc.field_f;
          if (param1 >= 38) {
            df.a(0, this.g(4));
            return param2;
          } else {
            return false;
          }
        } else {
          if (-1 != (al.field_f ^ -1)) {
            if (var5 != 0) {
              L1: {
                this.a(param0, (qa) (this), kc.field_b, -31628, ag.field_f, param3, al.field_f);
                if (jk.field_r == 0) {
                  break L1;
                } else {
                  if (this.a(param0, true, ob.field_e, (qa) (this), pb.field_d, jk.field_r, param3)) {
                    param2 = false;
                    break L1;
                  } else {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      this.f(-1);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        L2: {
                          param2 = false;
                          if (0 != kc.field_f) {
                            break L2;
                          } else {
                            if (ta.field_u != 0) {
                              L3: {
                                this.a((byte) 5, (qa) (this), param3, ag.field_f, kc.field_b, param0);
                                var12 = wi.field_e;
                                var6 = var12;
                                if (var12 != null) {
                                  L4: {
                                    if (var12.field_s instanceof vd) {
                                      ((vd) ((Object) var12.field_s)).a(var12, (qj) null, (byte) -46);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  wi.field_e = null;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              if (var7 == 0) {
                                break L2;
                              } else {
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  if (-1 == (jk.field_r ^ -1)) {
                                    break L2;
                                  } else {
                                    this.f(-1);
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        ta.field_u = kc.field_f;
                        if (param1 >= 38) {
                          df.a(0, this.g(4));
                          return param2;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              if (0 == kc.field_f) {
                if (ta.field_u != 0) {
                  L5: {
                    this.a((byte) 5, (qa) (this), param3, ag.field_f, kc.field_b, param0);
                    var13 = wi.field_e;
                    var6 = var13;
                    if (var13 != null) {
                      L6: {
                        if (var13.field_s instanceof vd) {
                          ((vd) ((Object) var13.field_s)).a(var13, (qj) null, (byte) -46);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      wi.field_e = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (var7 == 0) {
                      break L7;
                    } else {
                      if (var5 == 0) {
                        break L7;
                      } else {
                        if (-1 == (jk.field_r ^ -1)) {
                          break L7;
                        } else {
                          this.f(-1);
                          ta.field_u = kc.field_f;
                          if (param1 >= 38) {
                            df.a(0, this.g(4));
                            return param2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  ta.field_u = kc.field_f;
                  if (param1 >= 38) {
                    df.a(0, this.g(4));
                    return param2;
                  } else {
                    return false;
                  }
                } else {
                  ta.field_u = kc.field_f;
                  if (param1 >= 38) {
                    df.a(0, this.g(4));
                    return param2;
                  } else {
                    return false;
                  }
                }
              } else {
                ta.field_u = kc.field_f;
                if (param1 >= 38) {
                  df.a(0, this.g(4));
                  return param2;
                } else {
                  return false;
                }
              }
            } else {
              L8: {
                if (jk.field_r == 0) {
                  break L8;
                } else {
                  if (this.a(param0, true, ob.field_e, (qa) (this), pb.field_d, jk.field_r, param3)) {
                    param2 = false;
                    break L8;
                  } else {
                    if (var5 == 0) {
                      break L8;
                    } else {
                      this.f(-1);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        L9: {
                          param2 = false;
                          if (0 != kc.field_f) {
                            break L9;
                          } else {
                            if (ta.field_u != 0) {
                              L10: {
                                this.a((byte) 5, (qa) (this), param3, ag.field_f, kc.field_b, param0);
                                var10 = wi.field_e;
                                var6 = var10;
                                if (var10 != null) {
                                  L11: {
                                    if (var10.field_s instanceof vd) {
                                      ((vd) ((Object) var10.field_s)).a(var10, (qj) null, (byte) -46);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  wi.field_e = null;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var7 == 0) {
                                break L9;
                              } else {
                                if (var5 == 0) {
                                  break L9;
                                } else {
                                  if (-1 == (jk.field_r ^ -1)) {
                                    break L9;
                                  } else {
                                    this.f(-1);
                                    ta.field_u = kc.field_f;
                                    if (param1 < 38) {
                                      return false;
                                    } else {
                                      df.a(0, this.g(4));
                                      return param2;
                                    }
                                  }
                                }
                              }
                            } else {
                              ta.field_u = kc.field_f;
                              if (param1 < 38) {
                                return false;
                              } else {
                                df.a(0, this.g(4));
                                return param2;
                              }
                            }
                          }
                        }
                        ta.field_u = kc.field_f;
                        if (param1 < 38) {
                          return false;
                        } else {
                          df.a(0, this.g(4));
                          return param2;
                        }
                      }
                    }
                  }
                }
              }
              L12: {
                if (0 != kc.field_f) {
                  break L12;
                } else {
                  if (ta.field_u != 0) {
                    L13: {
                      this.a((byte) 5, (qa) (this), param3, ag.field_f, kc.field_b, param0);
                      var11 = wi.field_e;
                      if (var11 != null) {
                        L14: {
                          if (var11.field_s instanceof vd) {
                            ((vd) ((Object) var11.field_s)).a(var11, (qj) null, (byte) -46);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        wi.field_e = null;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (var7 == 0) {
                      break L12;
                    } else {
                      if (var5 == 0) {
                        break L12;
                      } else {
                        if (-1 == (jk.field_r ^ -1)) {
                          break L12;
                        } else {
                          this.f(-1);
                          ta.field_u = kc.field_f;
                          if (param1 >= 38) {
                            df.a(0, this.g(4));
                            return param2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    ta.field_u = kc.field_f;
                    if (param1 < 38) {
                      return false;
                    } else {
                      df.a(0, this.g(4));
                      return param2;
                    }
                  }
                }
              }
              ta.field_u = kc.field_f;
              if (param1 >= 38) {
                df.a(0, this.g(4));
                return param2;
              } else {
                return false;
              }
            }
          } else {
            L15: {
              if (jk.field_r == 0) {
                break L15;
              } else {
                if (this.a(param0, true, ob.field_e, (qa) (this), pb.field_d, jk.field_r, param3)) {
                  param2 = false;
                  break L15;
                } else {
                  if (var5 == 0) {
                    break L15;
                  } else {
                    this.f(-1);
                    if (var7 == 0) {
                      break L15;
                    } else {
                      L16: {
                        param2 = false;
                        if (0 != kc.field_f) {
                          break L16;
                        } else {
                          if (ta.field_u != 0) {
                            L17: {
                              this.a((byte) 5, (qa) (this), param3, ag.field_f, kc.field_b, param0);
                              var8 = wi.field_e;
                              if (var8 != null) {
                                L18: {
                                  if (var8.field_s instanceof vd) {
                                    ((vd) ((Object) var8.field_s)).a(var8, (qj) null, (byte) -46);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                wi.field_e = null;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var7 == 0) {
                              break L16;
                            } else {
                              if (var5 == 0) {
                                break L16;
                              } else {
                                if (-1 == (jk.field_r ^ -1)) {
                                  break L16;
                                } else {
                                  this.f(-1);
                                  break L16;
                                }
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      ta.field_u = kc.field_f;
                      if (param1 < 38) {
                        return false;
                      } else {
                        df.a(0, this.g(4));
                        return param2;
                      }
                    }
                  }
                }
              }
            }
            L19: {
              if (0 != kc.field_f) {
                break L19;
              } else {
                if (ta.field_u != 0) {
                  L20: {
                    this.a((byte) 5, (qa) (this), param3, ag.field_f, kc.field_b, param0);
                    var9 = wi.field_e;
                    var6 = var9;
                    if (var9 != null) {
                      L21: {
                        if (var9.field_s instanceof vd) {
                          ((vd) ((Object) var9.field_s)).a(var9, (qj) null, (byte) -46);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      wi.field_e = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (var7 == 0) {
                    break L19;
                  } else {
                    if (var5 == 0) {
                      break L19;
                    } else {
                      if (-1 == (jk.field_r ^ -1)) {
                        break L19;
                      } else {
                        this.f(-1);
                        ta.field_u = kc.field_f;
                        if (param1 < 38) {
                          return false;
                        } else {
                          df.a(0, this.g(4));
                          return param2;
                        }
                      }
                    }
                  }
                } else {
                  ta.field_u = kc.field_f;
                  if (param1 < 38) {
                    return false;
                  } else {
                    df.a(0, this.g(4));
                    return param2;
                  }
                }
              }
            }
            ta.field_u = kc.field_f;
            if (param1 < 38) {
              return false;
            } else {
              df.a(0, this.g(4));
              return param2;
            }
          }
        }
    }

    void f(int param0) {
        if (param0 != -1) {
            this.field_m = (String) null;
        }
    }

    final static dd h(int param0) {
        int var1;
        byte[] var2;
        int[] var3;
        int var4_int;
        dd var4;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        var1 = ob.field_a[0] * ij.field_H[0];
        var2 = of.field_d[0];
        var3 = new int[var1];
        var4_int = 0;
        L0: while (true) {
          L1: {
            if (var1 <= var4_int) {
              break L1;
            } else {
              var3[var4_int] = rd.field_d[sc.a((int) var2[var4_int], 255)];
              var4_int++;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = new dd(e.field_e, uf.field_k, vg.field_I[0], b.field_b[0], ij.field_H[0], ob.field_a[0], var3);
          c.o(-28210);
          if (param0 <= 75) {
            field_t = (String) null;
            return var4;
          } else {
            return var4;
          }
        }
    }

    String g(int param0) {
        if (param0 == 4) {
          if (!this.field_x) {
            return null;
          } else {
            return this.field_m;
          }
        } else {
          this.a('P', (byte) 48, 41);
          if (!this.field_x) {
            return null;
          } else {
            return this.field_m;
          }
        }
    }

    qa(String param0, kd param1) {
        this(param0, nf.field_M.field_i, param1);
    }

    final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_y).append(",").append(this.field_z).append(" ").append(this.field_u).append("x").append(this.field_j);
              if (null == this.field_i) {
                break L1;
              } else {
                discarded$1 = param2.append(" text=\"").append(this.field_i).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_x) {
                discarded$2 = param2.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.e(1)) {
                break L3;
              } else {
                discarded$3 = param2.append(" focused");
                break L3;
              }
            }
            L4: {
              if (this.field_p == null) {
                break L4;
              } else {
                L5: {
                  discarded$4 = param2.append(" renderer=");
                  if (!(this.field_p instanceof qa)) {
                    break L5;
                  } else {
                    param2 = this.a(param2, param3, param0 - -1, -71);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                discarded$5 = param2.append(this.field_p);
                break L4;
              }
            }
            L6: {
              var5_int = 27 / ((param1 - 36) / 46);
              if (null != this.field_s) {
                L7: {
                  L8: {
                    discarded$6 = param2.append(" listener=");
                    if (this.field_s instanceof qa) {
                      break L8;
                    } else {
                      discarded$7 = param2.append(this.field_s);
                      if (var6 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param2 = this.a(param2, param3, 1 + param0, -110);
                  break L7;
                }
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("qa.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
    }

    final void b(boolean param0) {
        this.a(this.field_y, this.field_u, this.field_z, this.field_j, 80);
        if (param0) {
            this.g(-71);
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          if (0 == param3) {
            if (null == this.field_p) {
              return;
            } else {
              this.field_p.a(-96, param1, true, (qa) (this), param0);
              return;
            }
          } else {
            return;
          }
        } else {
          field_o = (String) null;
          if (0 != param3) {
            return;
          } else {
            L0: {
              if (null != this.field_p) {
                this.field_p.a(-96, param1, true, (qa) (this), param0);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    int c(byte param0) {
        if (param0 != 8) {
            field_o = (String) null;
            return 0;
        }
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = fleas.field_A ? 1 : 0;
        var4 = this.c((byte) 8);
        var5_int = param0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.b(param1, param2, true, var5_int);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = oe.a(param0 ^ 19007);
            if (var5 != null) {
              nf.field_M.a(param0 + 13421772, aa.field_t, var5, gg.field_f);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
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
              if (param0 == -2) {
                break L1;
              } else {
                this.a(46, -115, (StringBuilder) null, (Hashtable) null);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("qa.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
            this.field_v = 0;
            if (param0 != 5) {
                qa.d(-24);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qa.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4;
        if (param1 <= -15) {
          if (this.e(1)) {
            if (!this.a(-2, param2, (qa) (this), param0)) {
              var4 = param2;
              if (80 == var4) {
                return this.a((qa) (this), -124);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param2;
            if (80 == var4) {
              return this.a((qa) (this), -124);
            } else {
              return false;
            }
          }
        } else {
          qa.h(111);
          if (this.e(1)) {
            if (!this.a(-2, param2, (qa) (this), param0)) {
              var4 = param2;
              if (80 == var4) {
                return this.a((qa) (this), -124);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param2;
            if (80 == var4) {
              return this.a((qa) (this), -124);
            } else {
              return false;
            }
          }
        }
    }

    boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -31628) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("qa.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 0) {
          if (param1 - -this.field_y <= param3) {
            if (param4 >= param0 + this.field_z) {
              if (this.field_u + param1 - -this.field_y > param3) {
                if (this.field_j + param0 + this.field_z <= param4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    protected qa() {
        this.field_n = 0;
        this.field_r = 0;
    }

    qa(String param0, ch param1, kd param2) {
        eg var4 = null;
        this.field_n = 0;
        this.field_r = 0;
        try {
            this.field_s = param2;
            this.field_i = param0;
            this.field_p = param1;
            if (this.field_p instanceof eg) {
                var4 = (eg) ((Object) this.field_p);
                this.field_u = var4.a(-110, (qa) (this));
                this.field_j = var4.b(-101, (qa) (this));
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qa(int param0, int param1, int param2, int param3, ch param4, kd param5) {
        this.field_n = 0;
        this.field_r = 0;
        try {
            this.field_j = param3;
            this.field_y = param0;
            this.field_p = param4;
            this.field_s = param5;
            this.field_u = param2;
            this.field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    boolean e(int param0) {
        if (param0 != 1) {
            this.a(-97, -125, (qa) null, 'ﾹ');
            return false;
        }
        return false;
    }

    static {
        field_o = "<%0>Slopes:<%1> Fleas can climb these.";
        field_k = 4;
        field_q = "They can only be placed on empty squares.";
        field_t = "Passwords can only contain letters and numbers";
    }
}
