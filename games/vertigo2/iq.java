/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class iq extends li {
    uf field_v;
    int field_t;
    int field_s;
    int field_A;
    boolean field_p;
    static ed field_x;
    String field_q;
    int field_y;
    int field_o;
    ur field_B;
    static String field_z;
    String field_w;
    int field_u;
    int field_n;
    ro field_r;

    StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
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
            L1: {
              if (this.a(param3, -1, param1, param0)) {
                this.a(param0, param3, true, param1);
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 == -79) {
              stackIn_7_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("iq.FA(");

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4;
        if (!this.f(73)) {
          var4 = param1;
          if ((var4 ^ -1) != -81) {
            if (param0 >= -84) {
              this.a(113, -23, 115);
              return false;
            } else {
              return false;
            }
          } else {
            return this.a((byte) 116, (iq) (this));
          }
        } else {
          if (!this.a(param2, 13, param1, (iq) (this))) {
            var4 = param1;
            if ((var4 ^ -1) != -81) {
              if (param0 < -84) {
                return false;
              } else {
                this.a(113, -23, 115);
                return false;
              }
            } else {
              return this.a((byte) 116, (iq) (this));
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 == 0) {
          if (this.field_o + param2 <= param3) {
            if (this.field_t + param1 <= param4) {
              if (this.field_o + param2 + this.field_n > param3) {
                if (param4 >= this.field_s + this.field_t + param1) {
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

    final static int e(int param0) {
        if (param0 != 12343) {
            field_x = (ed) null;
            return wp.field_a;
        }
        return wp.field_a;
    }

    final boolean a(int param0, boolean param1, byte param2, int param3) {
        int var5;
        int var6;
        qg var6_ref_qg;
        int var7;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          this.a((byte) 12, param3, param0, (iq) (this));
          var5 = this.f(84) ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            if (var5 != 0) {
              if (0 != kf.field_c) {
                this.d((byte) 2);
                if (var7 != 0) {
                  break L0;
                } else {
                  rg.field_c = q.field_v;
                  qc.a(this.a(false), 74);
                  var6 = 96 % ((4 - param2) / 50);
                  return param1;
                }
              } else {
                rg.field_c = q.field_v;
                qc.a(this.a(false), 74);
                var6 = 96 % ((4 - param2) / 50);
                return param1;
              }
            } else {
              rg.field_c = q.field_v;
              qc.a(this.a(false), 74);
              var6 = 96 % ((4 - param2) / 50);
              return param1;
            }
          }
        }
        L1: {
          if (-1 == (uo.field_h ^ -1)) {
            break L1;
          } else {
            if (var5 == 0) {
              break L1;
            } else {
              L2: {
                this.a(ed.field_n, uo.field_h, param3, param0, gb.field_d, (byte) -122, (iq) (this));
                if (-1 == (kf.field_c ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (this.a(sd.field_N, param3, param0, (iq) (this), kf.field_c, (byte) -125, no.field_e)) {
                      break L3;
                    } else {
                      this.d((byte) 2);
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param1 = false;
                  break L2;
                }
              }
              if (q.field_v == 0) {
                if (rg.field_c != 0) {
                  this.a((iq) (this), (byte) 46, param3, param0, ed.field_n, gb.field_d);
                  var6_ref_qg = um.field_E;
                  if (var6_ref_qg != null) {
                    if (!(var6_ref_qg.field_v instanceof sh)) {
                      um.field_E = null;
                      rg.field_c = q.field_v;
                      qc.a(this.a(false), 74);
                      var6 = 96 % ((4 - param2) / 50);
                      return param1;
                    } else {
                      ((sh) ((Object) var6_ref_qg.field_v)).a(-13413, var6_ref_qg, (ac) null);
                      um.field_E = null;
                      rg.field_c = q.field_v;
                      qc.a(this.a(false), 74);
                      var6 = 96 % ((4 - param2) / 50);
                      return param1;
                    }
                  } else {
                    rg.field_c = q.field_v;
                    qc.a(this.a(false), 74);
                    var6 = 96 % ((4 - param2) / 50);
                    return param1;
                  }
                } else {
                  rg.field_c = q.field_v;
                  qc.a(this.a(false), 74);
                  var6 = 96 % ((4 - param2) / 50);
                  return param1;
                }
              } else {
                rg.field_c = q.field_v;
                qc.a(this.a(false), 74);
                var6 = 96 % ((4 - param2) / 50);
                return param1;
              }
            }
          }
        }
        if (-1 != (kf.field_c ^ -1)) {
          L4: {
            if (this.a(sd.field_N, param3, param0, (iq) (this), kf.field_c, (byte) -125, no.field_e)) {
              param1 = false;
              break L4;
            } else {
              if (var5 != 0) {
                this.d((byte) 2);
                if (var7 == 0) {
                  break L4;
                } else {
                  param1 = false;
                  if (q.field_v == 0) {
                    if (rg.field_c != 0) {
                      this.a((iq) (this), (byte) 46, param3, param0, ed.field_n, gb.field_d);
                      var6_ref_qg = um.field_E;
                      if (var6_ref_qg != null) {
                        if (!(var6_ref_qg.field_v instanceof sh)) {
                          um.field_E = null;
                          rg.field_c = q.field_v;
                          qc.a(this.a(false), 74);
                          var6 = 96 % ((4 - param2) / 50);
                          return param1;
                        } else {
                          ((sh) ((Object) var6_ref_qg.field_v)).a(-13413, var6_ref_qg, (ac) null);
                          um.field_E = null;
                          rg.field_c = q.field_v;
                          qc.a(this.a(false), 74);
                          var6 = 96 % ((4 - param2) / 50);
                          return param1;
                        }
                      } else {
                        rg.field_c = q.field_v;
                        qc.a(this.a(false), 74);
                        var6 = 96 % ((4 - param2) / 50);
                        return param1;
                      }
                    } else {
                      rg.field_c = q.field_v;
                      qc.a(this.a(false), 74);
                      var6 = 96 % ((4 - param2) / 50);
                      return param1;
                    }
                  } else {
                    rg.field_c = q.field_v;
                    qc.a(this.a(false), 74);
                    var6 = 96 % ((4 - param2) / 50);
                    return param1;
                  }
                }
              } else {
                if (q.field_v == 0) {
                  if (rg.field_c != 0) {
                    this.a((iq) (this), (byte) 46, param3, param0, ed.field_n, gb.field_d);
                    var6_ref_qg = um.field_E;
                    if (var6_ref_qg != null) {
                      if (!(var6_ref_qg.field_v instanceof sh)) {
                        um.field_E = null;
                        rg.field_c = q.field_v;
                        qc.a(this.a(false), 74);
                        var6 = 96 % ((4 - param2) / 50);
                        return param1;
                      } else {
                        ((sh) ((Object) var6_ref_qg.field_v)).a(-13413, var6_ref_qg, (ac) null);
                        um.field_E = null;
                        rg.field_c = q.field_v;
                        qc.a(this.a(false), 74);
                        var6 = 96 % ((4 - param2) / 50);
                        return param1;
                      }
                    } else {
                      rg.field_c = q.field_v;
                      qc.a(this.a(false), 74);
                      var6 = 96 % ((4 - param2) / 50);
                      return param1;
                    }
                  } else {
                    rg.field_c = q.field_v;
                    qc.a(this.a(false), 74);
                    var6 = 96 % ((4 - param2) / 50);
                    return param1;
                  }
                } else {
                  rg.field_c = q.field_v;
                  qc.a(this.a(false), 74);
                  var6 = 96 % ((4 - param2) / 50);
                  return param1;
                }
              }
            }
          }
          if (q.field_v == 0) {
            if (rg.field_c != 0) {
              this.a((iq) (this), (byte) 46, param3, param0, ed.field_n, gb.field_d);
              var6_ref_qg = um.field_E;
              if (var6_ref_qg != null) {
                if (!(var6_ref_qg.field_v instanceof sh)) {
                  um.field_E = null;
                  rg.field_c = q.field_v;
                  qc.a(this.a(false), 74);
                  var6 = 96 % ((4 - param2) / 50);
                  return param1;
                } else {
                  ((sh) ((Object) var6_ref_qg.field_v)).a(-13413, var6_ref_qg, (ac) null);
                  um.field_E = null;
                  rg.field_c = q.field_v;
                  qc.a(this.a(false), 74);
                  var6 = 96 % ((4 - param2) / 50);
                  return param1;
                }
              } else {
                rg.field_c = q.field_v;
                qc.a(this.a(false), 74);
                var6 = 96 % ((4 - param2) / 50);
                return param1;
              }
            } else {
              rg.field_c = q.field_v;
              qc.a(this.a(false), 74);
              var6 = 96 % ((4 - param2) / 50);
              return param1;
            }
          } else {
            rg.field_c = q.field_v;
            qc.a(this.a(false), 74);
            var6 = 96 % ((4 - param2) / 50);
            return param1;
          }
        } else {
          if (q.field_v == 0) {
            if (rg.field_c != 0) {
              this.a((iq) (this), (byte) 46, param3, param0, ed.field_n, gb.field_d);
              var6_ref_qg = um.field_E;
              if (var6_ref_qg != null) {
                if (!(var6_ref_qg.field_v instanceof sh)) {
                  um.field_E = null;
                  rg.field_c = q.field_v;
                  qc.a(this.a(false), 74);
                  var6 = 96 % ((4 - param2) / 50);
                  return param1;
                } else {
                  ((sh) ((Object) var6_ref_qg.field_v)).a(-13413, var6_ref_qg, (ac) null);
                  um.field_E = null;
                  rg.field_c = q.field_v;
                  qc.a(this.a(false), 74);
                  var6 = 96 % ((4 - param2) / 50);
                  return param1;
                }
              } else {
                rg.field_c = q.field_v;
                qc.a(this.a(false), 74);
                var6 = 96 % ((4 - param2) / 50);
                return param1;
              }
            } else {
              rg.field_c = q.field_v;
              qc.a(this.a(false), 74);
              var6 = 96 % ((4 - param2) / 50);
              return param1;
            }
          } else {
            rg.field_c = q.field_v;
            qc.a(this.a(false), 74);
            var6 = 96 % ((4 - param2) / 50);
            return param1;
          }
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        int var5_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            var5_int = this.a(0, param2, param1, ed.field_n, gb.field_d) ? 1 : 0;
            if (param0 >= 6) {
              L1: {
                if ((this.field_p ? 1 : 0) != var5_int) {
                  L2: {
                    stackIn_6_0 = this;

                    if (var5_int == 0) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    ((iq) (this)).field_p = stackIn_7_1 != 0;
                    if (this.field_v == null) {
                      break L3;
                    } else {
                      if (this.field_v instanceof wd) {
                        ((wd) ((Object) this.field_v)).a(-19618, var5_int != 0, (iq) (this));
                        break L3;
                      } else {
                        break L1;
                      }
                    }
                  }
                  break L1;
                } else {
                  break L1;
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
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("iq.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
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
              if (param5 <= -107) {
                break L1;
              } else {
                this.c((byte) 40);
                break L1;
              }
            }
            if (!this.a(0, param2, param1, param0, param6)) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.field_A = param4;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("iq.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    boolean a(char param0, int param1, int param2, iq param3) {
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
            if (param1 == 13) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_y = 82;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("iq.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(byte param0, int param1) {
        if (param0 >= -60) {
            return;
        }
        pk.a(1);
    }

    String a(boolean param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        if (param0) {
          L0: {
            this.c((byte) 24);
            if (this.field_p) {
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
            if (this.field_p) {
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

    iq(String param0, uf param1) {
        this(param0, eb.field_c.field_h, param1);
    }

    boolean a(byte param0, iq param1) {
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
            if (param0 == 116) {
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
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("iq.DA(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(boolean param0, int param1, int param2, int param3, int param4) {
        this.field_n = param4;
        this.field_t = param2;
        if (param0) {
            return;
        }
        this.field_o = param1;
        this.field_s = param3;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6_int;
        String var6;
        int var7;
        var7 = Vertigo2.field_L ? 1 : 0;
        var4 = 50 / ((-5 - param1) / 34);
        var5 = this.c((byte) -109);
        var6_int = 0;
        L0: while (true) {
          L1: {
            if (var6_int > var5) {
              break L1;
            } else {
              this.a(false, var6_int, param0, param2);
              var6_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var6 = ti.a((byte) -52);
            if (var6 != null) {
              eb.field_c.a(var6, -48, hn.field_n, rl.field_db);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
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
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.a((StringBuilder) null, -88, 38, (Hashtable) null);
                break L1;
              }
            }
            L2: {
              discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_t).append(" ").append(this.field_n).append("x").append(this.field_s);
              if (null != this.field_w) {
                discarded$1 = param1.append(" text=\"").append(this.field_w).append('"');
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.field_p) {
                break L3;
              } else {
                discarded$2 = param1.append(" mouseover");
                break L3;
              }
            }
            L4: {
              if (!this.f(87)) {
                break L4;
              } else {
                discarded$3 = param1.append(" focused");
                break L4;
              }
            }
            L5: {
              if (this.field_B != null) {
                L6: {
                  discarded$4 = param1.append(" renderer=");
                  if (!(this.field_B instanceof iq)) {
                    break L6;
                  } else {
                    param1 = this.a(param0, param3 + 1, (byte) -79, param1);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                discarded$5 = param1.append(this.field_B);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              L8: {
                if (null == this.field_v) {
                  break L8;
                } else {
                  L9: {
                    discarded$6 = param1.append(" listener=");
                    if (!(this.field_v instanceof iq)) {
                      break L9;
                    } else {
                      param1 = this.a(param0, param3 + 1, (byte) -79, param1);
                      if (var6 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  discarded$7 = param1.append(this.field_v);
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

            stackIn_22_1 = new StringBuilder().append("iq.CB(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
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
              if (param1 == -1) {
                break L1;
              } else {
                this.field_t = 80;
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

            stackIn_9_1 = new StringBuilder().append("iq.HB(");

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
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void g(int param0) {
        this.a(false, this.field_o, this.field_t, this.field_s, this.field_n);
        if (param0 > -51) {
            this.a(44, 60, -37);
        }
    }

    public final String toString() {
        return this.a(new Hashtable(), 0, (byte) -79, new StringBuilder()).toString();
    }

    void a(boolean param0, int param1, int param2, int param3) {
        L0: {
          if (param1 != 0) {
            break L0;
          } else {
            if (null != this.field_B) {
              this.field_B.a(true, param2, true, (iq) (this), param3);
              break L0;
            } else {
              if (!param0) {
                return;
              } else {
                iq.e(-54);
                return;
              }
            }
          }
        }
        if (param0) {
          iq.e(-54);
          return;
        } else {
          return;
        }
    }

    boolean f(int param0) {
        if (param0 <= 3) {
            this.field_q = (String) null;
            return false;
        }
        return false;
    }

    void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        try {
            if (param1 != 46) {
                this.a(-119, -76, -10);
            }
            this.field_A = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "iq.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        field_x = null;
        if (param0 != -73) {
            iq.e(106);
            field_z = null;
            return;
        }
        field_z = null;
    }

    final static boolean b(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 84) {
              L1: {
                if (null == or.a(118, param0)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
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
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("iq.DB(");

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
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    int c(byte param0) {
        if (param0 >= -97) {
            return 84;
        }
        return 0;
    }

    final static int a(int param0, s param1, int param2, vi param3) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1.field_n == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param3 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1.field_p == param3.field_v) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (param2 == -1) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = -80;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var4_int = param3.field_o.length;
                        var5 = param1.field_n[param0].length / var4_int;
                        var6 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5 <= var6) {
                            statePc = 31;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_32_0 = (param3.field_r < param1.field_w[param0][var6] ? -1 : (param3.field_r == param1.field_w[param0][var6] ? 0 : 1));
                        stackIn_14_0 = stackIn_32_0;
                        if (var8 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (wc.a(param1.field_x[param0][var6], true)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_29_0 = param3.field_o[var7] ^ -1;
                        stackIn_23_0 = stackIn_29_0;
                        if (var8 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 == (param1.field_n[param0][var4_int * var6 - -var7] ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = var6;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    try {
                        var6++;
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = -1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0;
                }
                case 33: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_35_0 = (RuntimeException) (var4);
                    stackIn_34_0 = stackIn_35_0;
                    stackIn_35_1 = new StringBuilder().append("iq.KB(").append(param0).append(',');
                    stackIn_34_1 = stackIn_35_1;
                    if (param1 == null) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param2).append(',');
                    stackIn_37_1 = stackIn_38_1;
                    if (param3 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw wn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void d(byte param0) {
        if (param0 != 2) {
            field_z = (String) null;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8_int = 3 % ((param5 - -87) / 35);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("iq.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    protected iq() {
        this.field_y = 0;
        this.field_u = 0;
    }

    iq(String param0, ur param1, uf param2) {
        qa var4 = null;
        this.field_y = 0;
        this.field_u = 0;
        try {
            this.field_B = param1;
            this.field_v = param2;
            this.field_w = param0;
            if (this.field_B instanceof qa) {
                var4 = (qa) ((Object) this.field_B);
                this.field_n = var4.a((iq) (this), (byte) 112);
                this.field_s = var4.a((iq) (this), -1);
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "iq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    iq(int param0, int param1, int param2, int param3, ur param4, uf param5) {
        this.field_y = 0;
        this.field_u = 0;
        try {
            this.field_s = param3;
            this.field_o = param0;
            this.field_v = param5;
            this.field_n = param2;
            this.field_B = param4;
            this.field_t = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "iq.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new ed(256);
        field_z = "???";
    }
}
