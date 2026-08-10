/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fe extends pi {
    static me field_z;
    static String field_C;
    rm field_y;
    nf field_B;
    int field_o;
    int field_w;
    int field_p;
    static String field_r;
    int field_u;
    String field_s;
    String field_n;
    boolean field_x;
    int field_v;
    int field_t;
    int field_q;
    ad field_A;

    int b(byte param0) {
        if (param0 > -88) {
            return 118;
        }
        return 0;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (-1 == (param3 ^ -1)) {
          if (null != this.field_A) {
            this.field_A.a(12088, param1, (fe) (this), param2, true);
            if (param0 != 4) {
              this.a((byte) -96, -77, 94, -43);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 4) {
              this.a((byte) -96, -77, 94, -43);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 4) {
            this.a((byte) -96, -77, 94, -43);
            return;
          } else {
            return;
          }
        }
    }

    boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
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
            if (param2 == -79) {
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
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("fe.K(").append(param0).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void i(int param0) {
        if (param0 != -5257) {
          this.field_t = 71;
          this.a(this.field_q, -74, this.field_u, this.field_v, this.field_t);
          return;
        } else {
          this.a(this.field_q, -74, this.field_u, this.field_v, this.field_t);
          return;
        }
    }

    fe(String param0, rm param1) {
        this(param0, bd.field_c.field_b, param1);
    }

    public final String toString() {
        return this.a((byte) -70, new Hashtable(), 0, new StringBuilder()).toString();
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, fe param5, int param6) {
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
            if (param4 <= -53) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.b((byte) -86);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("fe.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, byte param2, fe param3) {
        int var5_int = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.b(gb.field_e, param1, param0, nk.field_w, -102) ? 1 : 0;
              if (param2 >= 49) {
                break L1;
              } else {
                this.field_A = (ad) null;
                break L1;
              }
            }
            L2: {
              stackIn_4_0 = this.field_x;

              if (var5_int != 0) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                if ((stackIn_5_0 ? 1 : 0) != stackIn_5_1) {
                  break L4;
                } else {
                  L5: {
                    stackIn_8_0 = this;

                    if (var5_int == 0) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L5;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
                      break L5;
                    }
                  }
                  ((fe) (this)).field_x = stackIn_9_1 != 0;
                  if (this.field_y == null) {
                    break L4;
                  } else {
                    if (!(this.field_y instanceof qb)) {
                      break L4;
                    } else {
                      ((qb) ((Object) this.field_y)).a(-14656, (fe) (this), var5_int != 0);
                      break L3;
                    }
                  }
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("fe.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static pf f(int param0) {
        String var1;
        if (param0 != 0) {
          return (pf) null;
        } else {
          L0: {
            var1 = fc.b((byte) 121);
            if (var1 == null) {
              break L0;
            } else {
              if (var1.indexOf('@') < 0) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new pf(fc.b((byte) 126), j.a((byte) -110));
        }
    }

    final static void e(int param0) {
        if (param0 != 26313) {
          fe.a((byte) 55, 'ﾗ', (CharSequence) null);
          kb.field_b = new ik();
          de.field_a.a((byte) -65, (fe) (kb.field_b));
          return;
        } else {
          kb.field_b = new ik();
          de.field_a.a((byte) -65, (fe) (kb.field_b));
          return;
        }
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4;
        if (!this.k(-91)) {
          if (param0 == -65) {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a((fe) (this), 125);
            } else {
              return false;
            }
          } else {
            fe.l(-56);
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a((fe) (this), 125);
            } else {
              return false;
            }
          }
        } else {
          if (!this.a(param2, (fe) (this), (byte) -79, param1)) {
            if (param0 != -65) {
              fe.l(-56);
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return this.a((fe) (this), 125);
              } else {
                return false;
              }
            } else {
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return this.a((fe) (this), 125);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, true, param2, param1)) {
                this.a(param1, param3, 34, param2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -70) {
                break L2;
              } else {
                this.field_B = (nf) null;
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fe.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 < -73) {
          if (param3 >= param1 + this.field_u) {
            if (param2 - -this.field_t <= param0) {
              if (param1 + (this.field_u + this.field_v) > param3) {
                if (this.field_q + (param2 + this.field_t) <= param0) {
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

    public static void l(int param0) {
        field_C = null;
        field_z = null;
        field_r = null;
        if (param0 > -48) {
            fe.a((byte) -5, '', (CharSequence) null);
        }
    }

    void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        try {
            this.field_w = param5;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "fe.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var7;
        ma var8;
        ma var9;
        ma var10;
        ma var11;
        var7 = MinerDisturbance.field_ab;
        this.a(param1, param2, (byte) 53, (fe) (this));
        var5 = this.k(param3 ^ 91) ? 1 : 0;
        if (param0) {
          L0: {
            if (0 == ki.field_n) {
              break L0;
            } else {
              if (var5 != 0) {
                this.a(param1, ki.field_n, gb.field_e, nk.field_w, (byte) -123, (fe) (this), param2);
                break L0;
              } else {
                L1: {
                  if (-1 == (jk.field_ab ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (!this.a(wi.field_w, param1, param3 + 0, m.field_e, jk.field_ab, (fe) (this), param2)) {
                        break L2;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      this.g(4966);
                      break L1;
                    }
                  }
                }
                if (-1 == (ld.field_B ^ -1)) {
                  if (-1 == (nb.field_f ^ -1)) {
                    nb.field_f = ld.field_B;
                    if (param3 == 0) {
                      tg.a(-95, this.h(-27867));
                      return param0;
                    } else {
                      return true;
                    }
                  } else {
                    this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                    var9 = j.field_d;
                    if (var9 != null) {
                      if (!(var9.field_y instanceof cd)) {
                        j.field_d = null;
                        nb.field_f = ld.field_B;
                        if (param3 != 0) {
                          return true;
                        } else {
                          tg.a(-95, this.h(-27867));
                          return param0;
                        }
                      } else {
                        ((cd) ((Object) var9.field_y)).a(27055, (se) null, var9);
                        j.field_d = null;
                        nb.field_f = ld.field_B;
                        if (param3 != 0) {
                          return true;
                        } else {
                          tg.a(-95, this.h(-27867));
                          return param0;
                        }
                      }
                    } else {
                      nb.field_f = ld.field_B;
                      if (param3 != 0) {
                        return true;
                      } else {
                        tg.a(-95, this.h(-27867));
                        return param0;
                      }
                    }
                  }
                } else {
                  nb.field_f = ld.field_B;
                  if (param3 != 0) {
                    return true;
                  } else {
                    tg.a(-95, this.h(-27867));
                    return param0;
                  }
                }
              }
            }
          }
          L3: {
            if (-1 == (jk.field_ab ^ -1)) {
              break L3;
            } else {
              L4: {
                if (!this.a(wi.field_w, param1, param3 + 0, m.field_e, jk.field_ab, (fe) (this), param2)) {
                  break L4;
                } else {
                  param0 = false;
                  if (var7 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (var5 == 0) {
                break L3;
              } else {
                L5: {
                  this.g(4966);
                  if (-1 != (ld.field_B ^ -1)) {
                    break L5;
                  } else {
                    if (-1 == (nb.field_f ^ -1)) {
                      break L5;
                    } else {
                      this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                      var10 = j.field_d;
                      if (var10 != null) {
                        if (!(var10.field_y instanceof cd)) {
                          j.field_d = null;
                          nb.field_f = ld.field_B;
                          if (param3 == 0) {
                            tg.a(-95, this.h(-27867));
                            return param0;
                          } else {
                            return true;
                          }
                        } else {
                          ((cd) ((Object) var10.field_y)).a(27055, (se) null, var10);
                          j.field_d = null;
                          nb.field_f = ld.field_B;
                          if (param3 == 0) {
                            tg.a(-95, this.h(-27867));
                            return param0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        nb.field_f = ld.field_B;
                        if (param3 == 0) {
                          tg.a(-95, this.h(-27867));
                          return param0;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
                nb.field_f = ld.field_B;
                if (param3 == 0) {
                  tg.a(-95, this.h(-27867));
                  return param0;
                } else {
                  return true;
                }
              }
            }
          }
          L6: {
            if (-1 != (ld.field_B ^ -1)) {
              break L6;
            } else {
              if (-1 == (nb.field_f ^ -1)) {
                break L6;
              } else {
                this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                var11 = j.field_d;
                if (var11 != null) {
                  if (!(var11.field_y instanceof cd)) {
                    j.field_d = null;
                    nb.field_f = ld.field_B;
                    if (param3 == 0) {
                      tg.a(-95, this.h(-27867));
                      return param0;
                    } else {
                      return true;
                    }
                  } else {
                    ((cd) ((Object) var11.field_y)).a(27055, (se) null, var11);
                    j.field_d = null;
                    nb.field_f = ld.field_B;
                    if (param3 == 0) {
                      tg.a(-95, this.h(-27867));
                      return param0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  nb.field_f = ld.field_B;
                  if (param3 == 0) {
                    tg.a(-95, this.h(-27867));
                    return param0;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          nb.field_f = ld.field_B;
          if (param3 == 0) {
            tg.a(-95, this.h(-27867));
            return param0;
          } else {
            return true;
          }
        } else {
          if (var5 != 0) {
            if (0 != jk.field_ab) {
              this.g(4966);
              if (var7 != 0) {
                L7: {
                  if (0 == ki.field_n) {
                    break L7;
                  } else {
                    if (var5 != 0) {
                      this.a(param1, ki.field_n, gb.field_e, nk.field_w, (byte) -123, (fe) (this), param2);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-1 == (jk.field_ab ^ -1)) {
                    break L8;
                  } else {
                    L9: {
                      if (!this.a(wi.field_w, param1, param3 + 0, m.field_e, jk.field_ab, (fe) (this), param2)) {
                        break L9;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L8;
                    } else {
                      this.g(4966);
                      break L8;
                    }
                  }
                }
                L10: {
                  if (-1 != (ld.field_B ^ -1)) {
                    break L10;
                  } else {
                    if (-1 == (nb.field_f ^ -1)) {
                      break L10;
                    } else {
                      this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                      var8 = j.field_d;
                      if (var8 != null) {
                        if (!(var8.field_y instanceof cd)) {
                          j.field_d = null;
                          break L10;
                        } else {
                          ((cd) ((Object) var8.field_y)).a(27055, (se) null, var8);
                          j.field_d = null;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                nb.field_f = ld.field_B;
                if (param3 != 0) {
                  return true;
                } else {
                  tg.a(-95, this.h(-27867));
                  return param0;
                }
              } else {
                nb.field_f = ld.field_B;
                if (param3 != 0) {
                  return true;
                } else {
                  tg.a(-95, this.h(-27867));
                  return param0;
                }
              }
            } else {
              nb.field_f = ld.field_B;
              if (param3 != 0) {
                return true;
              } else {
                tg.a(-95, this.h(-27867));
                return param0;
              }
            }
          } else {
            nb.field_f = ld.field_B;
            if (param3 != 0) {
              return true;
            } else {
              tg.a(-95, this.h(-27867));
              return param0;
            }
          }
        }
    }

    boolean a(fe param0, int param1) {
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
            if (param1 > 119) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_C = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fe.UA(");

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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6_int;
        String var6;
        int var7;
        var7 = MinerDisturbance.field_ab;
        var4 = this.b((byte) -92);
        var5 = -64 % ((-61 - param2) / 51);
        var6_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var6_int) {
              break L1;
            } else {
              this.a((byte) 4, param0, param1, var6_int);
              var6_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var6 = a.a(true);
            if (var6 != null) {
              bd.field_c.a(ng.field_l, lj.field_q, var6, (byte) 49);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final boolean a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
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
              if (param1) {
                break L1;
              } else {
                fe.f(63);
                break L1;
              }
            }
            if (param3.containsKey(this)) {
              discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param3.put(this, this);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fe.KA(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= -33) {
          this.a(99, -116, 119, 127, (byte) -73, (fe) null, 7);
          this.field_v = param3;
          this.field_q = param0;
          this.field_u = param2;
          this.field_t = param4;
          return;
        } else {
          this.field_v = param3;
          this.field_q = param0;
          this.field_u = param2;
          this.field_t = param4;
          return;
        }
    }

    boolean k(int param0) {
        int var2 = -93 / ((-33 - param0) / 45);
        return false;
    }

    final static boolean j(int param0) {
        int var1 = 95 % ((param0 - 10) / 57);
        return 250 < mn.field_x ? true : false;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        char stackOut_5_0;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0 > 26) {
                break L1;
              } else {
                field_r = (String) null;
                break L1;
              }
            }
            var4 = param2.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 <= var5) {
                    break L4;
                  } else {
                    stackOut_5_0 = param1;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 != param2.charAt(var5)) {
                          break L5;
                        } else {
                          var3_int++;
                          break L5;
                        }
                      }
                      var5++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_10_0 = var3_int;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("fe.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    String h(int param0) {
        if (param0 != -27867) {
            return (String) null;
        }
        if (!this.field_x) {
            return null;
        }
        return this.field_n;
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_u).append(",").append(this.field_t).append(" ").append(this.field_v).append("x").append(this.field_q);
              if (null != this.field_s) {
                discarded$1 = param1.append(" text=\"").append(this.field_s).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_x) {
                discarded$2 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 == 34) {
                break L3;
              } else {
                fe.j(27);
                break L3;
              }
            }
            L4: {
              if (this.k(48)) {
                discarded$3 = param1.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != this.field_A) {
                L6: {
                  discarded$4 = param1.append(" renderer=");
                  if (!(this.field_A instanceof fe)) {
                    break L6;
                  } else {
                    param1 = this.a((byte) -70, param0, 1 + param3, param1);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                discarded$5 = param1.append(this.field_A);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (null != this.field_y) {
                L8: {
                  discarded$6 = param1.append(" listener=");
                  if (!(this.field_y instanceof fe)) {
                    break L8;
                  } else {
                    param1 = this.a((byte) -70, param0, param3 + 1, param1);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                discarded$7 = param1.append(this.field_y);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("fe.MA(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void g(int param0) {
        if (param0 != 4966) {
            this.field_s = (String) null;
        }
    }

    protected fe() {
        this.field_p = 0;
        this.field_o = 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
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
              if (param2 == 0) {
                break L1;
              } else {
                this.a((Hashtable) null, (StringBuilder) null, 107, -94);
                break L1;
              }
            }
            if (this.b(param3, param6, param1, param0, -120)) {
              this.field_w = param4;
              stackIn_5_0 = 0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("fe.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    fe(String param0, ad param1, rm param2) {
        RuntimeException runtimeException = null;
        cf var4 = null;
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
        this.field_p = 0;
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_A = param1;
              this.field_y = param2;
              this.field_s = param0;
              if (!(this.field_A instanceof cf)) {
                break L1;
              } else {
                var4 = (cf) ((Object) this.field_A);
                this.field_v = var4.a(14463, (fe) (this));
                this.field_q = var4.b(30, (fe) (this));
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

            stackIn_6_1 = new StringBuilder().append("fe.<init>(");

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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    fe(int param0, int param1, int param2, int param3, ad param4, rm param5) {
        this.field_p = 0;
        this.field_o = 0;
        try {
            this.field_u = param0;
            this.field_v = param2;
            this.field_y = param5;
            this.field_t = param1;
            this.field_q = param3;
            this.field_A = param4;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "fe.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Connection lost. <%0>";
        field_C = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
