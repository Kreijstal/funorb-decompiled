/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gl extends uf {
    cj field_l;
    static String field_t;
    int field_j;
    int field_y;
    static int field_k;
    static int field_m;
    ld field_q;
    boolean field_s;
    static String field_h;
    static String field_i;
    int field_n;
    String field_x;
    int field_p;
    sc field_r;
    int field_u;
    int field_v;
    int field_w;
    String field_o;

    final static ec b(String param0, int param1) {
        RuntimeException var2 = null;
        ec stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 20) {
                break L1;
              } else {
                gl.a(true);
                break L1;
              }
            }
            stackIn_3_0 = new ec(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gl.MB(");

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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    gl(String param0, sc param1) {
        this(param0, vc.field_c.field_t, param1);
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
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
              if (!this.a(param3, param2, param0, param6, param1)) {
                break L1;
              } else {
                this.field_j = param4;
                break L1;
              }
            }
            if (!param0) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.a(46, -85, true, 48, 3);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("gl.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 <= -106) {
          if (0 == param2) {
            if (this.field_l == null) {
              return;
            } else {
              this.field_l.a(param3, (gl) (this), param0, -24381, true);
              return;
            }
          } else {
            return;
          }
        } else {
          this.a(65, (byte) -102, 18, -45, 98);
          if (0 == param2) {
            if (this.field_l == null) {
              return;
            } else {
              this.field_l.a(param3, (gl) (this), param0, -24381, true);
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean d(int param0) {
        if (param0 > -103) {
            field_t = (String) null;
            return false;
        }
        return false;
    }

    String f(int param0) {
        String var3;
        if (param0 >= 70) {
          if (!this.field_s) {
            return null;
          } else {
            return this.field_x;
          }
        } else {
          var3 = (String) null;
          gl.b((String) null, 49);
          if (!this.field_s) {
            return null;
          } else {
            return this.field_x;
          }
        }
    }

    boolean a(char param0, gl param1, int param2, int param3) {
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
            if (param2 == 30) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("gl.K(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
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
              if (param0 == 34) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.a(param1, param3, -48, param2)) {
                this.a(param3, param2, (byte) 27, param1);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("gl.KA(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    void e(int param0) {
        if (param0 > 0) {
            this.field_n = 83;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            field_k = 105;
            field_t = null;
            field_h = null;
            return;
        }
        field_t = null;
        field_h = null;
    }

    final boolean a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        Hashtable var6 = null;
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
              if (param2 < -29) {
                break L1;
              } else {
                var6 = (Hashtable) null;
                this.a((StringBuilder) null, (Hashtable) null, -39, -117);
                break L1;
              }
            }
            if (param1.containsKey(this)) {
              discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param1.put(this, this);
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

            stackIn_9_1 = new StringBuilder().append("gl.PB(");

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
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    boolean a(byte param0, gl param1) {
        RuntimeException var3 = null;
        gl var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 2) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var4 = (gl) null;
              this.a((gl) null, -124, 106, 49, -92, 11, (byte) 17);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gl.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var7;
        cb var8;
        cb var9;
        cb var10;
        cb var11;
        cb var12;
        var7 = Terraphoenix.field_V;
        this.a((gl) (this), param2, param1, 85);
        if (param3 >= 111) {
          var5 = this.d(-113) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (ma.field_I == 0) {
                ab.field_k = oh.field_f;
                b.a((byte) 16, this.f(105));
                return param0;
              } else {
                this.e(-31);
                ab.field_k = oh.field_f;
                b.a((byte) 16, this.f(105));
                return param0;
              }
            } else {
              ab.field_k = oh.field_f;
              b.a((byte) 16, this.f(105));
              return param0;
            }
          } else {
            if (vj.field_P != 0) {
              if (var5 != 0) {
                L0: {
                  this.a((gl) (this), param1, vj.field_P, ef.field_j, param2, jb.field_b, (byte) 37);
                  if (-1 == (ma.field_I ^ -1)) {
                    break L0;
                  } else {
                    L1: {
                      if (!this.a(false, mm.field_c, param2, param1, ma.field_I, (gl) (this), lm.field_c)) {
                        break L1;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      this.e(-23);
                      break L0;
                    }
                  }
                }
                if (oh.field_f == 0) {
                  if (0 != ab.field_k) {
                    L2: {
                      this.a(79, ef.field_j, param2, param1, jb.field_b, (gl) (this));
                      var12 = oj.field_w;
                      if (var12 == null) {
                        break L2;
                      } else {
                        if (!(var12.field_r instanceof fe)) {
                          oj.field_w = null;
                          break L2;
                        } else {
                          ((fe) ((Object) var12.field_r)).a((hj) null, var12, 98);
                          oj.field_w = null;
                          break L2;
                        }
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (ma.field_I != 0) {
                          this.e(-31);
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, this.f(105));
                          return param0;
                        } else {
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, this.f(105));
                          return param0;
                        }
                      } else {
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, this.f(105));
                        return param0;
                      }
                    } else {
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, this.f(105));
                      return param0;
                    }
                  } else {
                    ab.field_k = oh.field_f;
                    b.a((byte) 16, this.f(105));
                    return param0;
                  }
                } else {
                  ab.field_k = oh.field_f;
                  b.a((byte) 16, this.f(105));
                  return param0;
                }
              } else {
                L3: {
                  if (-1 == (ma.field_I ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (!this.a(false, mm.field_c, param2, param1, ma.field_I, (gl) (this), lm.field_c)) {
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
                        this.e(-23);
                        if (oh.field_f != 0) {
                          break L5;
                        } else {
                          if (0 == ab.field_k) {
                            break L5;
                          } else {
                            L6: {
                              this.a(79, ef.field_j, param2, param1, jb.field_b, (gl) (this));
                              var10 = oj.field_w;
                              if (var10 == null) {
                                break L6;
                              } else {
                                if (!(var10.field_r instanceof fe)) {
                                  oj.field_w = null;
                                  break L6;
                                } else {
                                  ((fe) ((Object) var10.field_r)).a((hj) null, var10, 98);
                                  oj.field_w = null;
                                  break L6;
                                }
                              }
                            }
                            if (var7 == 0) {
                              break L5;
                            } else {
                              if (var5 == 0) {
                                break L5;
                              } else {
                                if (ma.field_I != 0) {
                                  this.e(-31);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, this.f(105));
                      return param0;
                    }
                  }
                }
                if (oh.field_f == 0) {
                  if (0 != ab.field_k) {
                    this.a(79, ef.field_j, param2, param1, jb.field_b, (gl) (this));
                    var11 = oj.field_w;
                    if (var11 == null) {
                      if (var7 != 0) {
                        if (var5 != 0) {
                          if (ma.field_I != 0) {
                            this.e(-31);
                            ab.field_k = oh.field_f;
                            b.a((byte) 16, this.f(105));
                            return param0;
                          } else {
                            ab.field_k = oh.field_f;
                            b.a((byte) 16, this.f(105));
                            return param0;
                          }
                        } else {
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, this.f(105));
                          return param0;
                        }
                      } else {
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, this.f(105));
                        return param0;
                      }
                    } else {
                      if (!(var11.field_r instanceof fe)) {
                        L7: {
                          oj.field_w = null;
                          if (var7 == 0) {
                            break L7;
                          } else {
                            if (var5 == 0) {
                              break L7;
                            } else {
                              if (ma.field_I != 0) {
                                this.e(-31);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, this.f(105));
                        return param0;
                      } else {
                        ((fe) ((Object) var11.field_r)).a((hj) null, var11, 98);
                        L8: {
                          oj.field_w = null;
                          if (var7 == 0) {
                            break L8;
                          } else {
                            if (var5 == 0) {
                              break L8;
                            } else {
                              if (ma.field_I != 0) {
                                this.e(-31);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, this.f(105));
                        return param0;
                      }
                    }
                  } else {
                    ab.field_k = oh.field_f;
                    b.a((byte) 16, this.f(105));
                    return param0;
                  }
                } else {
                  ab.field_k = oh.field_f;
                  b.a((byte) 16, this.f(105));
                  return param0;
                }
              }
            } else {
              L9: {
                if (-1 == (ma.field_I ^ -1)) {
                  break L9;
                } else {
                  L10: {
                    if (!this.a(false, mm.field_c, param2, param1, ma.field_I, (gl) (this), lm.field_c)) {
                      break L10;
                    } else {
                      param0 = false;
                      if (var7 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L9;
                  } else {
                    L11: {
                      this.e(-23);
                      if (oh.field_f != 0) {
                        break L11;
                      } else {
                        if (0 == ab.field_k) {
                          break L11;
                        } else {
                          L12: {
                            this.a(79, ef.field_j, param2, param1, jb.field_b, (gl) (this));
                            var8 = oj.field_w;
                            if (var8 == null) {
                              break L12;
                            } else {
                              if (!(var8.field_r instanceof fe)) {
                                oj.field_w = null;
                                break L12;
                              } else {
                                ((fe) ((Object) var8.field_r)).a((hj) null, var8, 98);
                                oj.field_w = null;
                                break L12;
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L11;
                          } else {
                            if (var5 == 0) {
                              break L11;
                            } else {
                              if (ma.field_I != 0) {
                                this.e(-31);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    ab.field_k = oh.field_f;
                    b.a((byte) 16, this.f(105));
                    return param0;
                  }
                }
              }
              if (oh.field_f == 0) {
                if (0 != ab.field_k) {
                  this.a(79, ef.field_j, param2, param1, jb.field_b, (gl) (this));
                  var9 = oj.field_w;
                  if (var9 == null) {
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (ma.field_I == 0) {
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, this.f(105));
                          return param0;
                        } else {
                          this.e(-31);
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, this.f(105));
                          return param0;
                        }
                      } else {
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, this.f(105));
                        return param0;
                      }
                    } else {
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, this.f(105));
                      return param0;
                    }
                  } else {
                    if (!(var9.field_r instanceof fe)) {
                      L13: {
                        oj.field_w = null;
                        if (var7 == 0) {
                          break L13;
                        } else {
                          if (var5 == 0) {
                            break L13;
                          } else {
                            if (ma.field_I != 0) {
                              this.e(-31);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, this.f(105));
                      return param0;
                    } else {
                      ((fe) ((Object) var9.field_r)).a((hj) null, var9, 98);
                      L14: {
                        oj.field_w = null;
                        if (var7 == 0) {
                          break L14;
                        } else {
                          if (var5 == 0) {
                            break L14;
                          } else {
                            if (ma.field_I != 0) {
                              this.e(-31);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, this.f(105));
                      return param0;
                    }
                  }
                } else {
                  ab.field_k = oh.field_f;
                  b.a((byte) 16, this.f(105));
                  return param0;
                }
              } else {
                ab.field_k = oh.field_f;
                b.a((byte) 16, this.f(105));
                return param0;
              }
            }
          }
        } else {
          return true;
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        this.field_p = param2;
        if (param1 <= 45) {
            return;
        }
        this.field_w = param3;
        this.field_u = param0;
        this.field_n = param4;
    }

    void a(gl param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param3 >= 25) {
              L1: {
                var5_int = this.a(param2, param1, false, jb.field_b, ef.field_j) ? 1 : 0;
                stackIn_4_0 = var5_int;

                if (this.field_s) {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 1;
                  break L1;
                }
              }
              L2: {
                if (stackIn_5_0 == stackIn_5_1) {
                  L3: {
                    stackIn_9_0 = this;

                    if (var5_int == 0) {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 0;
                      break L3;
                    } else {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 1;
                      break L3;
                    }
                  }
                  ((gl) (this)).field_s = stackIn_10_1 != 0;
                  if (this.field_r == null) {
                    break L2;
                  } else {
                    if (!(this.field_r instanceof de)) {
                      break L2;
                    } else {
                      ((de) ((Object) this.field_r)).a(true, var5_int != 0, (gl) (this));
                      break L2;
                    }
                  }
                } else {
                  break L2;
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
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("gl.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_j = 0;
              if (param0 >= 36) {
                break L1;
              } else {
                this.d(18);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("gl.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    int d(byte param0) {
        if (param0 < 23) {
            gl.a(false);
            return 0;
        }
        return 0;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        if (this.d(-115)) {
            if (this.a(param1, (gl) (this), 30, param0)) {
                return true;
            }
            var4 = -56 % ((param2 - -62) / 48);
            var5 = param0;
            if (-81 == (var5 ^ -1)) {
                return this.a((byte) 98, (gl) (this));
            }
            return false;
        }
        var4 = -56 % ((param2 - -62) / 48);
        var5 = param0;
        if (!(-81 != (var5 ^ -1))) {
            return this.a((byte) 98, (gl) (this));
        }
        return false;
    }

    public final String toString() {
        return this.a(34, new StringBuilder(), 0, new Hashtable()).toString();
    }

    final void c(int param0) {
        if (param0 != 0) {
          this.field_j = -18;
          this.a(this.field_u, (byte) 92, this.field_p, this.field_w, this.field_n);
          return;
        } else {
          this.a(this.field_u, (byte) 92, this.field_p, this.field_w, this.field_n);
          return;
        }
    }

    final void a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_w).append(",").append(this.field_u).append(" ").append(this.field_p).append("x").append(this.field_n);
              if (null != this.field_o) {
                discarded$1 = param3.append(" text=\"").append(this.field_o).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_s) {
                discarded$2 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.d(-118)) {
                discarded$3 = param3.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 == 27) {
                break L4;
              } else {
                this.a(15, (byte) 16, 121, -54, 36);
                break L4;
              }
            }
            L5: {
              if (this.field_l != null) {
                L6: {
                  discarded$4 = param3.append(" renderer=");
                  if (this.field_l instanceof gl) {
                    break L6;
                  } else {
                    discarded$5 = param3.append(this.field_l);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                param3 = this.a(34, param3, 1 + param1, param0);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (null != this.field_r) {
                L8: {
                  discarded$6 = param3.append(" listener=");
                  if (this.field_r instanceof gl) {
                    break L8;
                  } else {
                    discarded$7 = param3.append(this.field_r);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                param3 = this.a(34, param3, param1 - -1, param0);
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
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("gl.QB(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Terraphoenix.field_V;
        if (param0 <= -18) {
          var4 = this.d((byte) 107);
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var4 < var5_int) {
                break L1;
              } else {
                this.a(param1, -116, var5_int, param2);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var5 = ml.e(19290);
            if (var5 == null) {
              return;
            } else {
              vc.field_c.b(lb.field_b, var5, ea.field_m, 4473924);
              return;
            }
          }
        } else {
          field_m = -77;
          var4 = this.d((byte) 107);
          var5_int = 0;
          L2: while (true) {
            L3: {
              if (var4 < var5_int) {
                break L3;
              } else {
                this.a(param1, -116, var5_int, param2);
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var5 = ml.e(19290);
            if (var5 == null) {
              return;
            } else {
              vc.field_c.b(lb.field_b, var5, ea.field_m, 4473924);
              return;
            }
          }
        }
    }

    final static void c(byte param0) {
        if (q.field_Jb == 10) {
          ag.a(8468);
          q.field_Jb = 11;
          da.field_f = true;
          if (param0 > 107) {
            return;
          } else {
            gl.c((byte) -35);
            return;
          }
        } else {
          if (!mi.a((byte) -108)) {
            ag.a(8468);
            q.field_Jb = 11;
            da.field_f = true;
            if (param0 <= 107) {
              gl.c((byte) -35);
              return;
            } else {
              return;
            }
          } else {
            da.field_f = true;
            if (param0 > 107) {
              return;
            } else {
              gl.c((byte) -35);
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        String var7;
        if (!param2) {
          if (param0 - -this.field_w <= param4) {
            if (param1 + this.field_u > param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param4 >= this.field_w + (param0 - -this.field_p)) {
                    break L1;
                  } else {
                    if (param3 >= param1 - -this.field_u + this.field_n) {
                      break L1;
                    } else {
                      stackIn_18_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          var7 = (String) null;
          gl.b((String) null, -102);
          if (param0 - -this.field_w <= param4) {
            if (param1 + this.field_u <= param3) {
              if (param4 < this.field_w + (param0 - -this.field_p)) {
                if (param3 >= param1 - -this.field_u + this.field_n) {
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
        }
    }

    boolean a(gl param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
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
            if (param6 > 6) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.a(-57, '�', (byte) 35);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("gl.DB(");

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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    protected gl() {
        this.field_y = 0;
        this.field_v = 0;
    }

    gl(String param0, cj param1, sc param2) {
        RuntimeException runtimeException = null;
        w var4 = null;
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
        this.field_y = 0;
        this.field_v = 0;
        try {
          L0: {
            L1: {
              this.field_o = param0;
              this.field_r = param2;
              this.field_l = param1;
              if (!(this.field_l instanceof w)) {
                break L1;
              } else {
                var4 = (w) ((Object) this.field_l);
                this.field_p = var4.a((gl) (this), (byte) 102);
                this.field_n = var4.b((gl) (this), (byte) 116);
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

            stackIn_6_1 = new StringBuilder().append("gl.<init>(");

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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    gl(int param0, int param1, int param2, int param3, cj param4, sc param5) {
        this.field_y = 0;
        this.field_v = 0;
        try {
            this.field_n = param3;
            this.field_w = param0;
            this.field_r = param5;
            this.field_p = param2;
            this.field_l = param4;
            this.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "gl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 0;
        field_h = "and activate autofire mode";
        field_i = "Difficulty: Easy";
        field_m = 20;
        field_t = "Saving the game will overwrite your previously saved game.";
    }
}
