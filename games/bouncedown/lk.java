/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lk extends ai {
    String field_q;
    ed field_l;
    int field_i;
    int field_u;
    static lj field_t;
    fc field_j;
    int field_v;
    int field_m;
    int field_r;
    sk field_n;
    static Boolean field_p;
    static String field_s;
    boolean field_g;
    int field_o;
    int field_k;
    String field_h;

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param2;
        this.field_r = param3;
        this.field_i = param4;
        this.field_m = param0;
        if (param1 != 80) {
            this.field_r = -53;
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        int var5_int = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.c(uc.field_C, 0, param2, param1, ll.field_y) ? 1 : 0;
              if (var5_int == (this.field_g ? 1 : 0)) {
                break L1;
              } else {
                L2: {
                  stackIn_3_0 = this;

                  if (var5_int == 0) {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    break L2;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    break L2;
                  }
                }
                ((lk) (this)).field_g = stackIn_4_1 != 0;
                if (null == this.field_n) {
                  break L1;
                } else {
                  if (this.field_n instanceof dj) {
                    ((dj) ((Object) this.field_n)).a(-124, var5_int != 0, (lk) (this));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0 == -1) {
                break L3;
              } else {
                this.field_g = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("lk.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param2, param3, (byte) 14, param0)) {
                break L1;
              } else {
                this.a(param0, param3, param2, 32362);
                break L1;
              }
            }
            if (param1) {
              stackIn_6_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("lk.HA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    int f(int param0) {
        if (param0 != 0) {
            this.field_k = -2;
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (-1 != (param0 ^ -1)) {
            break L0;
          } else {
            if (this.field_j != null) {
              this.field_j.a(param1, (lk) (this), (byte) -127, true, param3);
              break L0;
            } else {
              if (param2 >= 33) {
                return;
              } else {
                this.field_l = (ed) null;
                return;
              }
            }
          }
        }
        if (param2 < 33) {
          this.field_l = (ed) null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_r).append(",").append(this.field_i).append(" ").append(this.field_k).append("x").append(this.field_m);
              if (this.field_h == null) {
                break L1;
              } else {
                discarded$1 = param1.append(" text=\"").append(this.field_h).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_g) {
                discarded$2 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.e(param3 + -32361)) {
                break L3;
              } else {
                discarded$3 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (param3 == 32362) {
                break L4;
              } else {
                this.c(-89, 94, 115, -98, -13);
                break L4;
              }
            }
            L5: {
              if (this.field_j != null) {
                L6: {
                  discarded$4 = param1.append(" renderer=");
                  if (!(this.field_j instanceof lk)) {
                    break L6;
                  } else {
                    param1 = this.a(1 + param0, true, param2, param1);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                discarded$5 = param1.append(this.field_j);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              L8: {
                if (null == this.field_n) {
                  break L8;
                } else {
                  L9: {
                    discarded$6 = param1.append(" listener=");
                    if (!(this.field_n instanceof lk)) {
                      break L9;
                    } else {
                      param1 = this.a(1 + param0, true, param2, param1);
                      if (var6 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  discarded$7 = param1.append(this.field_n);
                  break L7;
                }
              }
              break L7;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("lk.OB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L11;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L11;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
    }

    lk(String param0, sk param1) {
        this(param0, ma.field_m.field_c, param1);
    }

    void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
            if (param4 != 34) {
                this.field_q = (String) null;
            }
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "lk.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    String d(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        if (param0 != 0) {
          L0: {
            this.e(15);
            if (this.field_g) {
              stackIn_8_0 = this.field_q;
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_g) {
              stackIn_4_0 = this.field_q;
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 28455) {
                break L1;
              } else {
                this.e(-128);
                break L1;
              }
            }
            if (!this.c(param3, 0, param6, param2, param5)) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.field_u = param0;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("lk.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        int var7;
        bj var8;
        bj var9;
        bj var10;
        bj var11;
        var7 = Bounce.field_N;
        this.a(-1, param0, param3, (lk) (this));
        var5 = this.e(1) ? 1 : 0;
        if (param2) {
          L0: {
            if (0 == va.field_a) {
              break L0;
            } else {
              if (var5 != 0) {
                this.a(param0, ll.field_y, va.field_a, uc.field_C, param3, (lk) (this), true);
                break L0;
              } else {
                L1: {
                  if (vh.field_e == 0) {
                    break L1;
                  } else {
                    L2: {
                      if (this.a(vh.field_e, (lk) (this), param0, og.field_a, 28455, rk.field_a, param3)) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          break L1;
                        } else {
                          this.c((byte) 114);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L1;
                  }
                }
                if (0 == n.field_m) {
                  if (0 == d.field_B) {
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, this.d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  } else {
                    this.a(ll.field_y, param0, (lk) (this), param3, 34, uc.field_C);
                    var9 = nd.field_A;
                    if (var9 != null) {
                      if (!(var9.field_n instanceof df)) {
                        nd.field_A = null;
                        d.field_B = n.field_m;
                        if (!param1) {
                          return false;
                        } else {
                          gk.a(73, this.d(0));
                          return param2;
                        }
                      } else {
                        ((df) ((Object) var9.field_n)).a(var9, (byte) 109, (se) null);
                        nd.field_A = null;
                        d.field_B = n.field_m;
                        if (!param1) {
                          return false;
                        } else {
                          gk.a(73, this.d(0));
                          return param2;
                        }
                      }
                    } else {
                      d.field_B = n.field_m;
                      if (!param1) {
                        return false;
                      } else {
                        gk.a(73, this.d(0));
                        return param2;
                      }
                    }
                  }
                } else {
                  d.field_B = n.field_m;
                  if (!param1) {
                    return false;
                  } else {
                    gk.a(73, this.d(0));
                    return param2;
                  }
                }
              }
            }
          }
          L3: {
            if (vh.field_e == 0) {
              break L3;
            } else {
              if (this.a(vh.field_e, (lk) (this), param0, og.field_a, 28455, rk.field_a, param3)) {
                param2 = false;
                break L3;
              } else {
                if (var5 == 0) {
                  break L3;
                } else {
                  this.c((byte) 114);
                  if (var7 == 0) {
                    break L3;
                  } else {
                    L4: {
                      param2 = false;
                      if (0 != n.field_m) {
                        break L4;
                      } else {
                        if (0 == d.field_B) {
                          break L4;
                        } else {
                          this.a(ll.field_y, param0, (lk) (this), param3, 34, uc.field_C);
                          var10 = nd.field_A;
                          if (var10 != null) {
                            if (!(var10.field_n instanceof df)) {
                              nd.field_A = null;
                              d.field_B = n.field_m;
                              if (param1) {
                                gk.a(73, this.d(0));
                                return param2;
                              } else {
                                return false;
                              }
                            } else {
                              ((df) ((Object) var10.field_n)).a(var10, (byte) 109, (se) null);
                              nd.field_A = null;
                              d.field_B = n.field_m;
                              if (param1) {
                                gk.a(73, this.d(0));
                                return param2;
                              } else {
                                return false;
                              }
                            }
                          } else {
                            d.field_B = n.field_m;
                            if (param1) {
                              gk.a(73, this.d(0));
                              return param2;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, this.d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
          L5: {
            if (0 != n.field_m) {
              break L5;
            } else {
              if (0 == d.field_B) {
                break L5;
              } else {
                this.a(ll.field_y, param0, (lk) (this), param3, 34, uc.field_C);
                var11 = nd.field_A;
                if (var11 != null) {
                  if (!(var11.field_n instanceof df)) {
                    nd.field_A = null;
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, this.d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  } else {
                    ((df) ((Object) var11.field_n)).a(var11, (byte) 109, (se) null);
                    nd.field_A = null;
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, this.d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  }
                } else {
                  d.field_B = n.field_m;
                  if (param1) {
                    gk.a(73, this.d(0));
                    return param2;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          d.field_B = n.field_m;
          if (param1) {
            gk.a(73, this.d(0));
            return param2;
          } else {
            return false;
          }
        } else {
          if (var5 != 0) {
            if (-1 != (vh.field_e ^ -1)) {
              this.c((byte) 114);
              if (var7 != 0) {
                L6: {
                  if (0 == va.field_a) {
                    break L6;
                  } else {
                    if (var5 != 0) {
                      this.a(param0, ll.field_y, va.field_a, uc.field_C, param3, (lk) (this), true);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (vh.field_e == 0) {
                    break L7;
                  } else {
                    L8: {
                      if (this.a(vh.field_e, (lk) (this), param0, og.field_a, 28455, rk.field_a, param3)) {
                        break L8;
                      } else {
                        if (var5 == 0) {
                          break L7;
                        } else {
                          this.c((byte) 114);
                          if (var7 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L7;
                  }
                }
                L9: {
                  if (0 != n.field_m) {
                    break L9;
                  } else {
                    if (0 == d.field_B) {
                      break L9;
                    } else {
                      this.a(ll.field_y, param0, (lk) (this), param3, 34, uc.field_C);
                      var8 = nd.field_A;
                      if (var8 != null) {
                        if (!(var8.field_n instanceof df)) {
                          nd.field_A = null;
                          break L9;
                        } else {
                          ((df) ((Object) var8.field_n)).a(var8, (byte) 109, (se) null);
                          nd.field_A = null;
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                d.field_B = n.field_m;
                if (!param1) {
                  return false;
                } else {
                  gk.a(73, this.d(0));
                  return param2;
                }
              } else {
                d.field_B = n.field_m;
                if (!param1) {
                  return false;
                } else {
                  gk.a(73, this.d(0));
                  return param2;
                }
              }
            } else {
              d.field_B = n.field_m;
              if (!param1) {
                return false;
              } else {
                gk.a(73, this.d(0));
                return param2;
              }
            }
          } else {
            d.field_B = n.field_m;
            if (!param1) {
              return false;
            } else {
              gk.a(73, this.d(0));
              return param2;
            }
          }
        }
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4;
        if (this.e(1)) {
          if (!this.a((lk) (this), param2, param1, -14565)) {
            if (param0 <= -72) {
              var4 = param1;
              if (80 == var4) {
                return this.a((lk) (this), false);
              } else {
                return false;
              }
            } else {
              this.a((byte) -98, -66, '￺');
              var4 = param1;
              if (80 == var4) {
                return this.a((lk) (this), false);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          if (param0 <= -72) {
            var4 = param1;
            if (80 == var4) {
              return this.a((lk) (this), false);
            } else {
              return false;
            }
          } else {
            this.a((byte) -98, -66, '￺');
            var4 = param1;
            if (80 == var4) {
              return this.a((lk) (this), false);
            } else {
              return false;
            }
          }
        }
    }

    final void g(int param0) {
        this.b(this.field_m, param0 + -11133, this.field_k, this.field_r, this.field_i);
        if (param0 != 11213) {
            this.a(69, false, (Hashtable) null, (StringBuilder) null);
        }
    }

    final void a(int param0, int param1, int param2) {
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Bounce.field_N;
                    var4 = this.f(0);
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 < var5) {
                        statePc = 18;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a(var5, param0, 85, param1);
                    var5++;
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var7 = ag.b(-1);
                    if (var7 != null) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ma.field_m.a(ha.field_b, var7, mh.field_Z, true);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param2 <= -28) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.a(88, (StringBuilder) null, (Hashtable) null, -53);
                    var9 = ag.b(-1);
                    if (var9 != null) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ma.field_m.a(ha.field_b, var9, mh.field_Z, true);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    var8 = ag.b(-1);
                    if (var8 != null) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ma.field_m.a(ha.field_b, var8, mh.field_Z, true);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 18: {
                    if (param2 > -28) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11 = ag.b(-1);
                    if (var11 != null) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ma.field_m.a(ha.field_b, var11, mh.field_Z, true);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    this.a(88, (StringBuilder) null, (Hashtable) null, -53);
                    var10 = ag.b(-1);
                    if (var10 != null) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    ma.field_m.a(ha.field_b, var10, mh.field_Z, true);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean e(int param0) {
        if (param0 != 1) {
            this.c((byte) -37);
            return false;
        }
        return false;
    }

    final boolean a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 14) {
                break L1;
              } else {
                this.a(-119, false, (Hashtable) null, (StringBuilder) null);
                break L1;
              }
            }
            if (!param0.containsKey(this)) {
              param0.put(this, this);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("lk.PB(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    public static void b(byte param0) {
        field_s = null;
        int var1 = 30 / ((param0 - -5) / 58);
        field_t = null;
        field_p = null;
    }

    boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
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
              if (!param1) {
                break L1;
              } else {
                this.a(8, 111, 24);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lk.PA(");

            if (param0 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, lk param5, boolean param6) {
        RuntimeException var8 = null;
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
              if (param6) {
                break L1;
              } else {
                lk.b((byte) -10);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("lk.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final String toString() {
        return this.a(0, true, new Hashtable(), new StringBuilder()).toString();
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == 0) {
          if (param0 >= this.field_r + param3) {
            if (param2 - -this.field_i <= param4) {
              if (param0 < param3 + this.field_r + this.field_k) {
                if (param4 >= this.field_m + param2 - -this.field_i) {
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
          return false;
        }
    }

    boolean a(lk param0, char param1, int param2, int param3) {
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
            if (param3 == -14565) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_n = (sk) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("lk.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void c(byte param0) {
        if (param0 < 80) {
            this.field_j = (fc) null;
        }
    }

    protected lk() {
        this.field_v = 0;
        this.field_o = 0;
    }

    lk(String param0, fc param1, sk param2) {
        RuntimeException runtimeException = null;
        sf var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_v = 0;
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_h = param0;
              this.field_n = param2;
              this.field_j = param1;
              if (!(this.field_j instanceof sf)) {
                break L1;
              } else {
                var4 = (sf) ((Object) this.field_j);
                this.field_k = var4.a(-79925823, (lk) (this));
                this.field_m = var4.a((lk) (this), 1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("lk.<init>(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    lk(int param0, int param1, int param2, int param3, fc param4, sk param5) {
        this.field_v = 0;
        this.field_o = 0;
        try {
            this.field_k = param2;
            this.field_j = param4;
            this.field_r = param0;
            this.field_m = param3;
            this.field_n = param5;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "lk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new lj();
        field_s = "Password is valid";
    }
}
