/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class el extends hf {
    int field_h;
    int field_r;
    dk field_w;
    int field_m;
    boolean field_l;
    String field_s;
    static int field_t;
    dh field_q;
    int field_v;
    int field_f;
    int field_k;
    int field_n;
    bb field_u;
    String field_j;
    static tf field_p;
    static int field_i;
    static gh field_o;
    static int field_g;

    final boolean a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (this.e((byte) 54)) {
          if (!this.a(param2, 13, param1, (el) (this))) {
            var4 = 71 / ((param0 - -40) / 63);
            var5 = param2;
            if (var5 == 80) {
              return this.a((byte) -75, (el) (this));
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          var4 = 71 / ((param0 - -40) / 63);
          var5 = param2;
          if (var5 == 80) {
            return this.a((byte) -75, (el) (this));
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -5927) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        if (-1 == (param3 ^ -1)) {
          if (null == this.field_q) {
            var5 = 35 % ((1 - param2) / 43);
            return;
          } else {
            this.field_q.a(param0, -81, param1, true, (el) (this));
            var5 = 35 % ((1 - param2) / 43);
            return;
          }
        } else {
          var5 = 35 % ((1 - param2) / 43);
          return;
        }
    }

    int d(byte param0) {
        if (param0 < 82) {
            field_p = (tf) null;
            return 0;
        }
        return 0;
    }

    public final String toString() {
        return this.a(0, new StringBuilder(), new Hashtable(), 0).toString();
    }

    boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 13) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_u = (bb) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("el.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(boolean param0, int param1, el param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                var5_int = this.a(qa.field_a, -1, ue.field_e, param1, param3) ? 1 : 0;
                stackOut_2_0 = var5_int;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (this.field_l) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              L2: {
                if (stackIn_5_0 == stackIn_5_1) {
                  L3: {
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5_int == 0) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  ((el) (this)).field_l = stackIn_10_1 != 0;
                  if (this.field_u == null) {
                    break L2;
                  } else {
                    if (this.field_u instanceof lg) {
                      ((lg) ((Object) this.field_u)).a(53, (el) (this), var5_int != 0);
                      break L2;
                    } else {
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
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("el.H(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == -1) {
          if (param0 >= this.field_v + param4) {
            if (param2 >= this.field_m + param3) {
              if (param0 < param4 + this.field_v - -this.field_r) {
                if (this.field_h + (this.field_m + param3) <= param2) {
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

    el(String param0, bb param1) {
        this(param0, hb.field_j.field_b, param1);
    }

    boolean a(byte param0, el param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 <= -30) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              discarded$2 = this.a(-77, -17, -47, -88, 79, (el) null, 49);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("el.UA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        int var5 = 0;
        la var6 = null;
        int var7 = 0;
        la var8 = null;
        la var9 = null;
        la var10 = null;
        la var11 = null;
        la var12 = null;
        la var14 = null;
        la var15 = null;
        la var16 = null;
        la var17 = null;
        var7 = Geoblox.field_C;
        if (param1 > 126) {
          this.a(false, param3, (el) (this), param2);
          var5 = this.e((byte) 54) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (-1 == (bi.field_g ^ -1)) {
                ij.field_X = gf.field_a;
                sa.a(this.c((byte) 69), (byte) 72);
                return param0;
              } else {
                this.d(-126);
                ij.field_X = gf.field_a;
                sa.a(this.c((byte) 69), (byte) 72);
                return param0;
              }
            } else {
              ij.field_X = gf.field_a;
              sa.a(this.c((byte) 69), (byte) 72);
              return param0;
            }
          } else {
            if (0 != vc.field_i) {
              if (var5 != 0) {
                discarded$1 = this.a(param3, vc.field_i, param2, -1, qa.field_a, (el) (this), ue.field_e);
                if (0 != bi.field_g) {
                  L0: {
                    L1: {
                      if (this.a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, (el) (this))) {
                        break L1;
                      } else {
                        if (var5 != 0) {
                          this.d(-127);
                          if (var7 == 0) {
                            break L0;
                          } else {
                            break L1;
                          }
                        } else {
                          L2: {
                            if (gf.field_a != 0) {
                              break L2;
                            } else {
                              if (0 == ij.field_X) {
                                break L2;
                              } else {
                                L3: {
                                  this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                                  var16 = lh.field_b;
                                  var6 = var16;
                                  if (var16 != null) {
                                    L4: {
                                      if (var16.field_u instanceof rg) {
                                        ((rg) ((Object) var16.field_u)).a((fk) null, var16, 22176);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    lh.field_b = null;
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
                                    if (-1 != (bi.field_g ^ -1)) {
                                      this.d(-126);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ij.field_X = gf.field_a;
                          sa.a(this.c((byte) 69), (byte) 72);
                          return param0;
                        }
                      }
                    }
                    param0 = false;
                    break L0;
                  }
                  if (gf.field_a == 0) {
                    if (0 != ij.field_X) {
                      L5: {
                        this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                        var17 = lh.field_b;
                        var6 = var17;
                        if (var17 != null) {
                          L6: {
                            if (var17.field_u instanceof rg) {
                              ((rg) ((Object) var17.field_u)).a((fk) null, var17, 22176);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          lh.field_b = null;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (var7 != 0) {
                        if (var5 != 0) {
                          if (-1 == (bi.field_g ^ -1)) {
                            ij.field_X = gf.field_a;
                            sa.a(this.c((byte) 69), (byte) 72);
                            return param0;
                          } else {
                            this.d(-126);
                            ij.field_X = gf.field_a;
                            sa.a(this.c((byte) 69), (byte) 72);
                            return param0;
                          }
                        } else {
                          ij.field_X = gf.field_a;
                          sa.a(this.c((byte) 69), (byte) 72);
                          return param0;
                        }
                      } else {
                        ij.field_X = gf.field_a;
                        sa.a(this.c((byte) 69), (byte) 72);
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      sa.a(this.c((byte) 69), (byte) 72);
                      return param0;
                    }
                  } else {
                    ij.field_X = gf.field_a;
                    sa.a(this.c((byte) 69), (byte) 72);
                    return param0;
                  }
                } else {
                  L7: {
                    if (gf.field_a != 0) {
                      break L7;
                    } else {
                      if (0 == ij.field_X) {
                        break L7;
                      } else {
                        L8: {
                          this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                          var15 = lh.field_b;
                          var6 = var15;
                          if (var15 != null) {
                            L9: {
                              if (var15.field_u instanceof rg) {
                                ((rg) ((Object) var15.field_u)).a((fk) null, var15, 22176);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            lh.field_b = null;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (var7 == 0) {
                          break L7;
                        } else {
                          if (var5 == 0) {
                            break L7;
                          } else {
                            if (-1 != (bi.field_g ^ -1)) {
                              this.d(-126);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  ij.field_X = gf.field_a;
                  sa.a(this.c((byte) 69), (byte) 72);
                  return param0;
                }
              } else {
                if (0 != bi.field_g) {
                  L10: {
                    L11: {
                      if (this.a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, (el) (this))) {
                        break L11;
                      } else {
                        if (var5 != 0) {
                          this.d(-127);
                          if (var7 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        } else {
                          if (gf.field_a == 0) {
                            if (0 != ij.field_X) {
                              L12: {
                                this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                                var12 = lh.field_b;
                                var6 = var12;
                                if (var12 != null) {
                                  L13: {
                                    if (var12.field_u instanceof rg) {
                                      ((rg) ((Object) var12.field_u)).a((fk) null, var12, 22176);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  lh.field_b = null;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              if (var7 != 0) {
                                if (var5 != 0) {
                                  if (-1 != (bi.field_g ^ -1)) {
                                    this.d(-126);
                                    ij.field_X = gf.field_a;
                                    sa.a(this.c((byte) 69), (byte) 72);
                                    return param0;
                                  } else {
                                    ij.field_X = gf.field_a;
                                    sa.a(this.c((byte) 69), (byte) 72);
                                    return param0;
                                  }
                                } else {
                                  ij.field_X = gf.field_a;
                                  sa.a(this.c((byte) 69), (byte) 72);
                                  return param0;
                                }
                              } else {
                                ij.field_X = gf.field_a;
                                sa.a(this.c((byte) 69), (byte) 72);
                                return param0;
                              }
                            } else {
                              ij.field_X = gf.field_a;
                              sa.a(this.c((byte) 69), (byte) 72);
                              return param0;
                            }
                          } else {
                            ij.field_X = gf.field_a;
                            sa.a(this.c((byte) 69), (byte) 72);
                            return param0;
                          }
                        }
                      }
                    }
                    param0 = false;
                    break L10;
                  }
                  if (gf.field_a == 0) {
                    if (0 != ij.field_X) {
                      L14: {
                        this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                        var14 = lh.field_b;
                        if (var14 != null) {
                          L15: {
                            if (var14.field_u instanceof rg) {
                              ((rg) ((Object) var14.field_u)).a((fk) null, var14, 22176);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          lh.field_b = null;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      if (var7 != 0) {
                        if (var5 != 0) {
                          if (-1 != (bi.field_g ^ -1)) {
                            this.d(-126);
                            ij.field_X = gf.field_a;
                            sa.a(this.c((byte) 69), (byte) 72);
                            return param0;
                          } else {
                            ij.field_X = gf.field_a;
                            sa.a(this.c((byte) 69), (byte) 72);
                            return param0;
                          }
                        } else {
                          ij.field_X = gf.field_a;
                          sa.a(this.c((byte) 69), (byte) 72);
                          return param0;
                        }
                      } else {
                        ij.field_X = gf.field_a;
                        sa.a(this.c((byte) 69), (byte) 72);
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      sa.a(this.c((byte) 69), (byte) 72);
                      return param0;
                    }
                  } else {
                    ij.field_X = gf.field_a;
                    sa.a(this.c((byte) 69), (byte) 72);
                    return param0;
                  }
                } else {
                  L16: {
                    if (gf.field_a != 0) {
                      break L16;
                    } else {
                      if (0 == ij.field_X) {
                        break L16;
                      } else {
                        L17: {
                          this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                          var11 = lh.field_b;
                          if (var11 != null) {
                            L18: {
                              if (var11.field_u instanceof rg) {
                                ((rg) ((Object) var11.field_u)).a((fk) null, var11, 22176);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            lh.field_b = null;
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
                            if (-1 != (bi.field_g ^ -1)) {
                              this.d(-126);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                  ij.field_X = gf.field_a;
                  sa.a(this.c((byte) 69), (byte) 72);
                  return param0;
                }
              }
            } else {
              if (0 != bi.field_g) {
                L19: {
                  L20: {
                    if (this.a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, (el) (this))) {
                      break L20;
                    } else {
                      if (var5 != 0) {
                        this.d(-127);
                        if (var7 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      } else {
                        L21: {
                          if (gf.field_a != 0) {
                            break L21;
                          } else {
                            if (0 == ij.field_X) {
                              break L21;
                            } else {
                              L22: {
                                this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                                var9 = lh.field_b;
                                if (var9 != null) {
                                  L23: {
                                    if (var9.field_u instanceof rg) {
                                      ((rg) ((Object) var9.field_u)).a((fk) null, var9, 22176);
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  lh.field_b = null;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              if (var7 == 0) {
                                break L21;
                              } else {
                                if (var5 == 0) {
                                  break L21;
                                } else {
                                  if (-1 != (bi.field_g ^ -1)) {
                                    this.d(-126);
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                        }
                        ij.field_X = gf.field_a;
                        sa.a(this.c((byte) 69), (byte) 72);
                        return param0;
                      }
                    }
                  }
                  param0 = false;
                  break L19;
                }
                if (gf.field_a == 0) {
                  if (0 != ij.field_X) {
                    L24: {
                      this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                      var10 = lh.field_b;
                      if (var10 != null) {
                        L25: {
                          if (var10.field_u instanceof rg) {
                            ((rg) ((Object) var10.field_u)).a((fk) null, var10, 22176);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        lh.field_b = null;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (-1 == (bi.field_g ^ -1)) {
                          ij.field_X = gf.field_a;
                          sa.a(this.c((byte) 69), (byte) 72);
                          return param0;
                        } else {
                          this.d(-126);
                          ij.field_X = gf.field_a;
                          sa.a(this.c((byte) 69), (byte) 72);
                          return param0;
                        }
                      } else {
                        ij.field_X = gf.field_a;
                        sa.a(this.c((byte) 69), (byte) 72);
                        return param0;
                      }
                    } else {
                      ij.field_X = gf.field_a;
                      sa.a(this.c((byte) 69), (byte) 72);
                      return param0;
                    }
                  } else {
                    ij.field_X = gf.field_a;
                    sa.a(this.c((byte) 69), (byte) 72);
                    return param0;
                  }
                } else {
                  ij.field_X = gf.field_a;
                  sa.a(this.c((byte) 69), (byte) 72);
                  return param0;
                }
              } else {
                L26: {
                  if (gf.field_a != 0) {
                    break L26;
                  } else {
                    if (0 == ij.field_X) {
                      break L26;
                    } else {
                      L27: {
                        this.a(param2, qa.field_a, true, (el) (this), param3, ue.field_e);
                        var8 = lh.field_b;
                        if (var8 != null) {
                          L28: {
                            if (var8.field_u instanceof rg) {
                              ((rg) ((Object) var8.field_u)).a((fk) null, var8, 22176);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          lh.field_b = null;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      if (var7 == 0) {
                        break L26;
                      } else {
                        if (var5 == 0) {
                          break L26;
                        } else {
                          if (-1 != (bi.field_g ^ -1)) {
                            this.d(-126);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                  }
                }
                ij.field_X = gf.field_a;
                sa.a(this.c((byte) 69), (byte) 72);
                return param0;
              }
            }
          }
        } else {
          return true;
        }
    }

    StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (!this.a(param1, param3, 10095, param2)) {
                break L1;
              } else {
                this.a(param3, param2, 34, param1);
                break L1;
              }
            }
            if (param0 == 0) {
              stackOut_5_0 = (StringBuilder) (param1);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = (StringBuilder) null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("el.PA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Geoblox.field_C;
        var4 = this.d((byte) 105);
        var5_int = param2;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.a(param1, param0, (byte) 54, var5_int);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = lf.c((byte) 55);
            if (var5 != null) {
              hb.field_j.a(nj.field_g, true, bc.field_a, var5);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        this.field_h = param0;
        this.field_v = param4;
        if (param2 >= -6) {
          this.field_k = 112;
          this.field_r = param1;
          this.field_m = param3;
          return;
        } else {
          this.field_r = param1;
          this.field_m = param3;
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var8_int = 93 % ((-3 - param1) / 38);
            if (this.a(param4, -1, param5, param0, param2)) {
              this.field_f = param3;
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("el.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -1) {
                break L1;
              } else {
                this.a(false, 57, (el) null, -122);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("el.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    String c(byte param0) {
        boolean discarded$14 = false;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 69) {
          L0: {
            discarded$14 = this.a((byte) -36, (el) null);
            if (this.field_l) {
              stackOut_7_0 = this.field_j;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (String) ((Object) stackOut_6_0);
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_l) {
              stackOut_3_0 = this.field_j;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (String) ((Object) stackOut_2_0);
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              discarded$8 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_v).append(",").append(this.field_m).append(" ").append(this.field_r).append("x").append(this.field_h);
              if (this.field_s != null) {
                discarded$9 = param3.append(" text=\"").append(this.field_s).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 34) {
                break L2;
              } else {
                this.field_v = -101;
                break L2;
              }
            }
            L3: {
              if (!this.field_l) {
                break L3;
              } else {
                discarded$10 = param3.append(" mouseover");
                break L3;
              }
            }
            L4: {
              if (this.e((byte) 54)) {
                discarded$11 = param3.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == this.field_q) {
                break L5;
              } else {
                L6: {
                  discarded$12 = param3.append(" renderer=");
                  if (!(this.field_q instanceof el)) {
                    break L6;
                  } else {
                    param3 = this.a(0, param3, param1, 1 + param0);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                discarded$13 = param3.append(this.field_q);
                break L5;
              }
            }
            L7: {
              if (null != this.field_u) {
                L8: {
                  discarded$14 = param3.append(" listener=");
                  if (this.field_u instanceof el) {
                    break L8;
                  } else {
                    discarded$15 = param3.append(this.field_u);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                param3 = this.a(0, param3, param1, 1 + param0);
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
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("el.DC(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    void d(int param0) {
        if (param0 >= -122) {
            this.a(76, -76, 91);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            boolean discarded$2 = false;
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            if (eh.field_d.field_f >= param1) {
              return true;
            } else {
              if (oc.field_e == null) {
                return false;
              } else {
                try {
                  L0: {
                    L1: {
                      if (param0 == 30000) {
                        break L1;
                      } else {
                        discarded$2 = el.b(-45, -75);
                        break L1;
                      }
                    }
                    var2_int = oc.field_e.a((byte) 110);
                    if ((var2_int ^ -1) >= -1) {
                      L2: {
                        if (-1 < (var2_int ^ -1)) {
                          jl.a((byte) -127);
                          break L2;
                        } else {
                          if (ll.a((byte) 12) <= 30000L) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            jl.a((byte) -127);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        if (-eh.field_d.field_f + param1 >= var2_int) {
                          break L3;
                        } else {
                          var2_int = param1 - eh.field_d.field_f;
                          break L3;
                        }
                      }
                      oc.field_e.a(eh.field_d.field_j, (byte) -97, eh.field_d.field_f, var2_int);
                      kh.field_e = oa.a(-12520);
                      eh.field_d.field_f = eh.field_d.field_f + var2_int;
                      if (param1 > eh.field_d.field_f) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        eh.field_d.field_f = 0;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    jl.a((byte) -120);
                    decompiledRegionSelector0 = 3;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_14_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_16_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, qc param1, qc param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
            if (param0) {
                field_p = (tf) null;
            }
            nh.a(param4, param3, 0, param2, param1.field_j, param1.field_f, true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "el.WB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    boolean e(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 54) {
            discarded$0 = this.a(65, 5, '￦', (el) null);
            return false;
        }
        return false;
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$4 = null;
        Object discarded$5 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 10095) {
                break L1;
              } else {
                this.field_u = (bb) null;
                break L1;
              }
            }
            if (param3.containsKey(this)) {
              discarded$4 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param3.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("el.CC(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void c(int param0) {
        int var2 = 117 % ((-3 - param0) / 63);
        this.a(this.field_h, this.field_r, (byte) -113, this.field_m, this.field_v);
    }

    void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        String discarded$2 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_f = 0;
              if (param2) {
                break L1;
              } else {
                discarded$2 = this.toString();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("el.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    protected el() {
        this.field_k = 0;
        this.field_n = 0;
    }

    el(String param0, dh param1, bb param2) {
        RuntimeException runtimeException = null;
        cc var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        this.field_k = 0;
        this.field_n = 0;
        try {
          L0: {
            L1: {
              this.field_q = param1;
              this.field_u = param2;
              this.field_s = param0;
              if (!(this.field_q instanceof cc)) {
                break L1;
              } else {
                var4 = (cc) ((Object) this.field_q);
                this.field_r = var4.a((el) (this), (byte) -33);
                this.field_h = var4.a(-122, (el) (this));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("el.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    el(int param0, int param1, int param2, int param3, dh param4, bb param5) {
        this.field_k = 0;
        this.field_n = 0;
        try {
            this.field_r = param2;
            this.field_v = param0;
            this.field_h = param3;
            this.field_m = param1;
            this.field_u = param5;
            this.field_q = param4;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "el.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = new tf();
        field_i = -1;
    }
}
